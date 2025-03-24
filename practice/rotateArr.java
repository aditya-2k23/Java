package practice;

import java.util.ArrayList;

public class rotateArr {

    public void rotateByr(ArrayList<Integer> arr, int r) {
        int n = arr.size();
        r = r % n;
        if (r < 0) {
            r = r + n;
        }
        for (int i = 0; i < r; i++) {
            int temp = arr.get(0);
            for (int j = 0; j < n - 1; j++) {
                arr.set(j, arr.get(j + 1));
            }
            arr.set(n - 1, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        System.out.println(numbers);

        rotateArr ra = new rotateArr();
        ra.rotateByr(numbers, 2);
        System.out.println(numbers);
    }
}
