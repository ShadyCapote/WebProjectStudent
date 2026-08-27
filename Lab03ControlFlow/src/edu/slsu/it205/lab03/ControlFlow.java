package edu.slsu.it205.lab03;
import java.util.Scanner;

public class ControlFlow {
     public static void main(String[] args) {

      //Problem C - Input Entry

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=====Menu=====");
            System.out.println("1. Grade Classifier");
            System.out.println("2. Counter Loop");
            System.out.println("3. Main Menu");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
           System.out.println();

            switch (choice) {
                case 1:
                    GradeClassifier.main(new String[]{}); // Call the main method of GradeClassifier
                    break;
                case 2:
                    CounterLoop.main(new String[]{}); // Call the main method of CounterLoop
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
     }
}
