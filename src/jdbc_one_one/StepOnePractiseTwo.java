package jdbc_one_one;
import java.sql.*;

public class StepOnePractiseTwo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";

            Connection connection = DriverManager.getConnection(url, user, password);
 
            if(connection.isClosed()) {
                System.out.println("Connection closed.........");
            } else {
                System.out.println("Conncetion is Open........");
            } 
            connection.close();
            if(connection.isClosed()) {
                System.out.println("Connection closed.........");
            } else {
                System.out.println("Conncetion is Open........");
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
