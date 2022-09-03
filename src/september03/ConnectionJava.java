package september03;

import java.sql.*;

public class ConnectionJava {

    // jdbc:mysql://hostname/ databaseName
    // this is for mysql
    private final String url = "jdbc:mysql://localhost/jdbc";
    private final String user = "root";
    private final String password = "abhi3254";

    public void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            if (connection.isClosed()) {
                System.out.println("Connection closed");
            } else {
                System.out.println("Connection open to use... :)");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
