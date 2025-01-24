// Write a Java program to calculate the grade of a student based on their marks using if-else conditional statements. The program should follow these criteria:

// Marks >= 90: Grade A
// Marks >= 80 and < 90: Grade B
// Marks >= 70 and < 80: Grade C
// Marks >= 60 and < 70: Grade D
// Marks < 60: Grade F
// The program should:

// Take the marks as input from the command line.
// Validate the input to ensure it is a positive integer between 0 and 100.
// Display the appropriate grade based on the marks.

package assignment;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter marks: ");
        int marks = sc.nextInt();

        if (marks > 100 || marks < 0)
            System.out.println("Invalid marks!");

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 80 && marks < 90)
            System.out.println("Grade B");
        else if (marks >= 70 && marks < 80)
            System.out.println("Grade C");
        else if (marks >= 60 && marks < 70)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");

        sc.close();
    }
}
