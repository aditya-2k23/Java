package practice;

import java.util.Scanner;

class Main {

    public static boolean isPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        return str.equals(s.reverse().toString());
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            System.out.printf(isPalindrome(str) ? "Yes" : "No");
        }
    }
}
