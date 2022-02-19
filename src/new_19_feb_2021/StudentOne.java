package new_19_feb_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentOne {
    public static void main(String[] args) throws IOException{
        System.out.println("Welcome to Student Manage App");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("Press 1 to Add Student");
            System.out.println("Press 2 to Delete Student");
            System.out.println("Press 3 to Display Student");
            System.out.println("Press 4 to Exit Student");

            var choice = Integer.parseInt(br.readLine());

            if(choice == 1) {
                // add student
            } else if (choice == 2) {
                // Delete Student
            } else if(choice == 3) {
                // Display Student
            } else if(choice == 4) {
                // exit
                break;
            }
        }
        System.out.println("Thank You");
    }
}
