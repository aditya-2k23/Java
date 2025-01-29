package assignment;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("false");
            sc.close();
            return;
        }

        String str = s1 + s1;
        if (str.contains(s2))
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}
