package chapter4;

//DO WHILE LOOP
//Program allows user to enter 2 numbers,
// sums them & user can proceed until they indicate done

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again = false;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over?");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }
}
