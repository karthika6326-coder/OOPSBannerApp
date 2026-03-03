import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {
        checkDivisibility();
        checkSmallest();
        checkLargest();
        sumNaturalNumbers();
    }

    public static void checkDivisibility() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isDivisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }

    public static void checkSmallest() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean isSmallest = (n1 < n2 && n1 < n3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }

    public static void checkLargest() {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println("Is the first number the largest? " + (n1 > n2 && n1 > n3));
        System.out.println("Is the second number the largest? " + (n2 > n1 && n2 > n3));
        System.out.println("Is the third number the largest? " + (n3 > n1 && n3 > n2));
    }

    public static void sumNaturalNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}