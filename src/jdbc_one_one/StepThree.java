package jdbc_one_one;

// Prepared Statement Example we are doing here 
// Here paramterized Query is going to execute

import java.sql.*;
public class StepThree {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";

            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a query

            String query = "INSERT INTO STUDENTS(NAME,AGE) VALUES (?,?)";

            // get the PreparedStatement object

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Now the values to the query

            preparedStatement.setString(1, "Abhinav Kumar");
            preparedStatement.setInt(2, 22);

            preparedStatement.executeUpdate();

            System.out.println("value Added....");
            
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
