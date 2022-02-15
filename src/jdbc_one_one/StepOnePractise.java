package jdbc_one_one;
import java.sql.*;

public class StepOnePractise {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";

            Connection connection = DriverManager.getConnection(url, user, password);

            if(connection.isClosed()){
                System.out.println("Connection is closed............");
            } else {
                System.out.println("Connection is Now Open to use.............");
            } 

            connection.close();

            if(connection.isClosed()){
                System.out.println("Connection is closed............");
            } else {
                System.out.println("Connection is Now Open to use.............");
            } 

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
