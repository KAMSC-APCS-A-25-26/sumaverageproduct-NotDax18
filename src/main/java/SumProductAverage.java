/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main (String[] args)
    {
        double num1, num2, num3;
        double average, sum, product;
        int numRuns = 0;
        //create Scanner object
        Scanner scan = new Scanner(System.in);
        // prompt user for number of runs
        System.out.print("How many times would you like to run the program? ");
        numRuns = scan.nextInt();
        for(int i = 0; i < numRuns; i++)
        {
            // Three numbers as inputs are given by user.
            System.out.print("Enter your inputs: ");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            num3 = scan.nextDouble();
            // Calculate average
            average = (num1 + num2 + num3)/3;
            // Calculate sum
            sum = (num1 + num2+ num3);
    
            // Calculate product
            product = num1 * num2 * num3;
            // prints the average
            System.out.print("Average: ");
            System.out.println(average);
            // prints the sum
            System.out.print("Sum: ");
            System.out.println(sum);
            // prints the product
            System.out.print("Product: ");
            System.out.println(product);
        }
    }
}
