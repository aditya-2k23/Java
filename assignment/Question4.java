package assignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double income = sc.nextDouble();
        boolean dueStatus = sc.nextBoolean();

        String eligibility = (age >= 18 && income >= 30000 && !dueStatus) ? "You are eligible for premium membership."
                : "You are not eligible for premium membership.";
        System.out.println(eligibility);

        sc.close();
    }
}
