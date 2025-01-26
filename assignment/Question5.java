package assignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current permissions (0-15): ");
        int permissions = sc.nextInt();

        System.out.print("Enter the bit position to toggle (0-3): ");
        int bitPosition = sc.nextInt();

        System.out.println("Original permissions: " + Integer.toBinaryString(permissions));

        int mask = 1 << bitPosition;
        permissions = permissions ^ mask;

        System.out.println("Updated permissions: " + Integer.toBinaryString(permissions));

        sc.close();
    }
}
