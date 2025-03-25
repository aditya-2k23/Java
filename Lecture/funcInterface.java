package Lecture;

@FunctionalInterface
// Functional interface can have only one abstract method
interface Animal {

    void Speaks();

    static void Walks() {
        System.out.println("Animal walks!");
    }
}

@FunctionalInterface
interface addNums {

    int sum(int a, int b);
}

public class funcInterface {

    public static void main(String[] args) {
        Animal obj = () -> System.out.println("Hello from lambda!");

        obj.Speaks();

        Animal.Walks();

        addNums sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.sum(5, 10));

    }
}
