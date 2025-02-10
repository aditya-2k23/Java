package assignment;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, k;

        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}
