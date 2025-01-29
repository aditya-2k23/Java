package assignment;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++)
                sum += arr[i][j];

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i + 1;
            }
        }

        System.out.println("Row with the maximum sum: " + maxRow);
        System.out.println("Maximum sum: " + maxSum);

        sc.close();
    }
}
