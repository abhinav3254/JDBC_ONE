package step_four;
import java.sql.*;
import java.io.*;
public class StepFour {
    public static void main(String[] args) {
        try {
            InputStreamReader iStreamReader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(iStreamReader);

            System.out.println("Enter Name:- ");
            String name = br.readLine();
            System.out.println("Enter AGE:-");
            int age = Integer.parseInt(br.readLine());


            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";
            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO STUDENTS(NAME,AGE) VALUES (?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);

            preparedStatement.executeUpdate();

            System.out.println("Inserted SuccesFully");
            connection.close();

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
