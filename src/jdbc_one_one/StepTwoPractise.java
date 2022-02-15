package jdbc_one_one;
import java.sql.*;

public class StepTwoPractise {
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

        String query = "DROP TABLE STUDENTS";

        Statement statement = connection.createStatement();

        statement.executeUpdate(query);

        System.out.println("Table drop");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
