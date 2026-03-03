import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {
        printOddEvenRange();
        calculateEmployeeBonus();
        printMultiplicationTable();
    }

    public static void printOddEvenRange() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }

    public static void calculateEmployeeBonus() {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();
        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("The bonus amount is " + bonus);
    }

    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}