package chapter2;

import java.util.Scanner;

public class GrossPayCalc {

    public static void main(String[] args) {

        //Get num of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours by pay rate
        double grossPay = hours * rate;

        //Display result
        System.out.println(grossPay);

    }
}
