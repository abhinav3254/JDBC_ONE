package jdbc_one_one;
import java.sql.*;
public class StepTwo {
    public static void main(String[] args) {
        
           try {
               
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

            // Creating a query

            String query = "CREATE TABLE STUDENTS (ID INT NOT NULL AUTO_INCREMENT,NAME VARCHAR (20) NOT NULL, AGE INT NOT NULL, PRIMARY KEY (ID) )";
                
            // Creating a statement because it is a simple query

            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

            System.out.println("Table created");

            connection.close();
            
           } catch (Exception e) {
               e.printStackTrace();
           }
    }
}
