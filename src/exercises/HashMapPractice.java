package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        //It takes in student names and ID numbers (as integers) ins tead of names and grades
        //The keys should be the IDs and the values should be the names.
        //Modify the roster printing code accordingly.

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudentId = input.nextInt();

            input.nextLine();

            if (!newStudentId.equals(-1)) {
                System.out.print("Name: ");
                String newStudentName = input.nextLine();
                System.out.println(newStudentName);

                students.put(newStudentId, newStudentName);


            }

        } while(!newStudentId.equals(-1));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}