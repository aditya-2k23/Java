package assignment;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total cart amount: ");
        double totalAmount = sc.nextDouble();
        double discount = 0.0;

        if (totalAmount > 5000)
            discount = totalAmount * 0.20;
        else if (totalAmount >= 3000 && totalAmount <= 5000)
            discount = totalAmount * 0.10;

        double finalAmount = totalAmount - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);

        sc.close();
    }
}
