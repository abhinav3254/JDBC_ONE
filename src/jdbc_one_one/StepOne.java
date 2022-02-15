package jdbc_one_one;
import java.sql.*;
public class StepOne {
    public static void main(String[] args) {
        try {
            //Load the driver this is step one
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";

            // Creating a Connection
            Connection connection = DriverManager.getConnection(url, user, password);


            // Test the connection if connection exists or not

            if(connection.isClosed()){
                System.out.println("Connection is still closed");
            } else {
                System.out.println("Connection created");
            }

            connection.close();

            if(connection.isClosed()){
                System.out.println("Connection is still closed");
            } else {
                System.out.println("Connection created");
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
