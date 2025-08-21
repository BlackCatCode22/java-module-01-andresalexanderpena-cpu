// LargestOfThree.java
// aaP 8/21/2025

import java.util.Scanner;


// Description of program
// This program will input three int from the user
// Programming will be finding the largest of the three numbers with nested if statements
// output will be an understandable statement of the largest number
// Example: You input the value of 55 for num2 and that was the lowest of three

public class LargestOfThree {
    public static void main(String[] args) {

        // variables needed for this program
        // initialize num1 to 0
        // 0 is assigned to num1
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        // Get input from the user
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the first int
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();
        // output the users input to make sure my program is working
        // read about concatenation
        System.out.println("\n the user entered " + num1 + " for num1 ");

        // prompt the user for the first int
        System.out.println("\n Please enter a whole number for num2: ");
        num2 = scanner.nextInt();
        // output the users input to make sure my program is working
        // read about concatenation
        System.out.println("\n the user entered " + num2 + " for num2 ");

        // prompt the user for the first int
        System.out.println("\n Please enter a whole number for num3: ");
        num3 = scanner.nextInt();
        // output the users input to make sure my program is working
        // read about concatenation
        System.out.println("\n the user entered " + num3 + " for num3 ");

        // Processing
        // Use nested if statements to find the largest
        if (num1 > num2) {
            if (num1 > num3) {
                // this is the true part
                largest = num1;
            } else {
                //this is the false part
                largest = num3;
            }
        }
        else {
            if (num2 > num3) {
                // this is the true part
                largest = num2;
            } else {
                //this is the false part
                largest = num3;
            }
        }

        // Output the largest number
        System.out.println("\n the largest num is: " + largest);

    }
}

