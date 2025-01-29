package assignment;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                reversed = 0;
            else if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                reversed = 0;
            else
                reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
