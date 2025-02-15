package assignment;

import java.util.Scanner;

public class Question24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int majorityElement = findMajorityElement(arr);
        System.out.println(majorityElement);

        sc.close();
    }

    private static int findMajorityElement(int[] arr) {
        int majorityElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majorityElement = arr[i];
                count = 1;
            }
        }

        return majorityElement;
    }
}
