package jdbc_one_one;
import java.sql.*;
public class StepTwoPractiseTwo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";

            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "CREATE TABLE STUDENTS (ID INT NOT NULL AUTO_INCREMENT,NAME VARCHAR (20) NOT NULL, AGE INT NOT NULL, PRIMARY KEY (ID) )";
            
            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

            System.out.println("Table created");

        } catch (Exception e) {
e.printStackTrace();        }
    }
}
