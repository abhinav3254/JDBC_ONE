package step_three;
import java.sql.*;
public class StepThree {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";
            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO STUDENTS(NAME,AGE) VALUES (?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "Abhinav Kumar");
            preparedStatement.setInt(2, 22);
            
            preparedStatement.executeUpdate();

            System.out.println("Inserted Into Datbase........");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
