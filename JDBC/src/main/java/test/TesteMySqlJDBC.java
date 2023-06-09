package test;

import java.sql.*;

public class TesteMySqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();
            var sql = "SELECT * FROM person";
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                System.out.print("ID: "+result.getInt("id"));
                System.out.print("; Name: "+result.getString("name"));
                System.out.print("; Last name: "+result.getString("surname"));
                System.out.print("; Email: "+result.getString("email"));
                System.out.print("; Cell: "+result.getString("cell"));
                System.out.println("");
            }
            result.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
