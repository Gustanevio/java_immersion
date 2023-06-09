package data;

import domain.Person;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonDAO {

    private static final String SQL_SELECT = "SELECT * FROM person";

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
        }finally{
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
}
