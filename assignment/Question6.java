package assignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words)
            if (word.length() > longestWord.length())
                longestWord = word;

        System.out.println(longestWord);

        sc.close();
    }
}
