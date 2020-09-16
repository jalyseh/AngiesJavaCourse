package chapter4loops;

/*NESTED LOOPS:
    Find the average of each students test scores*/

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {
        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //process all students
        for(int i = 0; i < numberOfStudents; i ++){

            double total = 0;
            for(int x = 0; x < numberOfTests; x++){
                System.out.println("enter the score for Test #" + (x + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i+1) + "is" + average);
        }

        scanner.close();
    }
}
