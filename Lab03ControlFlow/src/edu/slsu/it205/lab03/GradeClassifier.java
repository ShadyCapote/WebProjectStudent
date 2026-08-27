
package edu.slsu.it205.lab03;
import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        
      //Problem A - Grade Classifier

        int score; 

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the score (0-100): ");
        score = scanner.nextInt();



        if (score >= 90) {
            System.out.println("Grade: Excellent");
            System.out.println();
        } else if (score >= 80) {
            System.out.println("Grade: Good");
            System.out.println();
        } else if (score >= 70) {
            System.out.println("Grade: Average");
            System.out.println();   
        } else if (score >= 60) {
            System.out.println("Grade: Poor");
            System.out.println();
        } else {
            System.out.println("Grade: Fail");
            System.out.println();
        }
    }
}
