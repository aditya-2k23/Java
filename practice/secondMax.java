package practice;

import java.util.ArrayList;
import java.util.Collections;

public class secondMax {

    int returnSecondMax(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return -1;
        }
        Collections.sort(arr);
        return arr.get(arr.size() - 2);
    }

    int returnSecondMax2(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return -1;
        }
        int maxi = arr.get(0);
        int sMaxi = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxi) {
                sMaxi = maxi;
                maxi = arr.get(i);
            } else if (arr.get(i) > sMaxi && arr.get(i) < maxi) {
                sMaxi = arr.get(i);
            }
        }
        return sMaxi;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        secondMax sm = new secondMax();
        System.out.println("The second maximum from secondMax: " + sm.returnSecondMax(numbers));

        System.out.println("The second maximum from secondMax2 is: " + sm.returnSecondMax2(numbers));
    }
}
