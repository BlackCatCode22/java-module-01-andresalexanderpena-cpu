// SumOfUserNums.java
// aaP 8/19/2025

// I need to import the Scanner class from the
// java.util package - this is how I do that
import java.util.Scanner;
public class SumOfUserNums {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Sum of user program...\n");


        // Get 3 ints from the user and output the sum of ints

        // Create the variables needed
        int num1 = 0;

            System.out.println("\n The value of num1 is " + num1 + "\n");

        int num2 = 0;
        int num3 = 0;
        int sumOfInts = 0;

        // get user input
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get the first int
        System.out.println("\n Enter an integer for num1: ");
        num1 = scanner.nextInt();
        System.out.println("\n Enter an integer for num2: ");
        num2 = scanner.nextInt();
        System.out.println("\n Enter an integer for num3: ");
        num3 = scanner.nextInt();



        // Test it
        System.out.println("\n num1 is: " + num1);
        System.out.println("\n num1 is: " + num2);
        System.out.println("\n num1 is: " + num3);

        // add them up!
        sumOfInts = num1 + num2 + num3;

        // Test it!
        System.out.println("\n The sum of the ints is: " + sumOfInts);

        System.out.println("\n This is the end of my program.");

        }
    }