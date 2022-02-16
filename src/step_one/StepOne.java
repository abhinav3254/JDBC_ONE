package step_one;

import java.sql.*;
public class StepOne {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";
            Connection connection = DriverManager.getConnection(url, user, password);

            if(connection.isClosed()) {
                System.out.println("Connection is Still closed.......");
            } else {
                System.out.println("Connection is now Open to use...........");
            } 

            connection .close();
            
            if(connection.isClosed()) {
                System.out.println("Connection is Still closed.......");
            } else {
                System.out.println("Connection is now Open to use...........");
            } 


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
