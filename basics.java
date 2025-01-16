import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        System.out.println("Welcome to the core java class!");

        // Take user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter age");

        int age = myObj.nextInt();
        System.out.println("Age: " + age);

        myObj.close();
    }
}

// ! Compile using javac basics.java
// ! Run using java basics
