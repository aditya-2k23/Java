package assignment;

public class Question2 {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.5;
        char c = 'a';
        boolean b = true;

        System.out.println("Before conversion:");
        System.out.println("i: " + i);
        System.out.println("d: " + d);
        System.out.println("c: " + c);
        System.out.println("b: " + b);

        double intToDouble = (double) i;
        int charToInt = (int) c;

        System.out.println("After conversion:");
        System.out.println("intToDouble: " + intToDouble);
        System.out.println("charToInt: " + charToInt);
    }
}
