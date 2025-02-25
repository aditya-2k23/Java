package practice;

import java.util.Arrays;

class Main {

    static String sortedString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

    public static boolean anagramSort(String str1, String str2) {
        return sortedString(str1).equals(sortedString(str2));
    }

    public static boolean anagramASCII(String str1, String str2) {
        int[] count = new int[256];

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "3A@di", b = "Ad3i@";

        System.out.printf(anagramSort(a, b) ? "Yes\n" : "No\n");
        System.out.printf(anagramASCII(a, b) ? "Yes\n" : "No\n");
    }
}
