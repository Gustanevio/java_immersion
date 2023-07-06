package data;

import domain.Person;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonDAO {

    private static final String SQL_SELECT = "SELECT * FROM person";
    private static final String SQL_INSERT = "INSERT INTO person(name, surname, email, cell) VALUES(?, ?, ?, ?)";

    public List<Person> getAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        try {
            conn = ConnectionDB.getConnectio();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String cell = rs.getString("cell");

                person = new Person(id, name, surname, email, cell);
                persons.add(person);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConnectionDB.close(rs);
                ConnectionDB.close(stmt);
                ConnectionDB.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return persons;
    }
    public int insert(Person person){
        Connection conn = null;
        PreparedStatement smtm = null;
        int records = 0;
        try {
            conn = ConnectionDB.getConnectio();
            smtm = conn.prepareStatement(SQL_INSERT);
            smtm.setString(1, person.getName());
            smtm.setString(2, person.getSurname());
            smtm.setString(3, person.getEmail());
            smtm.setString(4, person.getCell());
            records = smtm.executeUpdate();
                    
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }finally {
            try {
                ConnectionDB.close(smtm);
                ConnectionDB.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return records; 
    }
}
