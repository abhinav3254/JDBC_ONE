package september03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to JDBC tutorial");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Hit 1 to add");
            System.out.println("Hit 4 to exit");
            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                System.out.print("Name:- ");
                String name = br.readLine();
                System.out.print("City:- ");
                String city = br.readLine();
                System.out.print("Phone:- ");
                String phone = br.readLine();

                Student student = new Student(name, phone, city);

                System.out.println(student.toString());
                ConnectionJava connectionJava = new ConnectionJava();
                connectionJava.createConnection();
            } else if (c == 4) {
                break;
            } else {

            }
        }
    }
}
