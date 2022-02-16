package image;
import java.sql.*;
import java.io.*;
public class SendImageToDataBase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcone";
            String user = "root";
            String password = "3254";
            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO IMAGES (PIC) VALUES (?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            String path = "C:\\Users\\abhin\\Desktop\\bg_1_files\\bull_gym.png";
            FileInputStream fileInputStream = new FileInputStream(path);

            preparedStatement.setBinaryStream(1, fileInputStream,fileInputStream.available());

            preparedStatement.executeUpdate();

            System.out.println("Image Inserted");

            connection.close();


        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
