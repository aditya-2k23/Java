package assignment;

import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private float marks;

    public Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }

    public void updateMarks(float newMarks) {
        this.marks = newMarks;
    }

    public void updateMarksByPercentage(float percentage) {
        this.marks += this.marks * (percentage / 100);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Marks: ");
        float marks = sc.nextFloat();

        Student student = new Student(name, rollNumber, marks);

        System.out.println("\nUpdate marks:");
        System.out.print("New Marks: ");
        float newMarks = sc.nextFloat();
        student.updateMarks(newMarks);
        System.out.print("Updated Details: ");
        student.displayDetails();

        System.out.println("\nUpdate marks by percentage increase:");
        System.out.print("Percentage: ");
        float percentage = sc.nextFloat();
        student.updateMarksByPercentage(percentage);
        System.out.print("Updated Details: ");
        student.displayDetails();

        sc.close();
    }
}
