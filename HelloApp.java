import java.util.Scanner;

public class Vel1PracticePrograms {

    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static double rounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SIMPLE INTEREST ===");

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = simpleInterest(p, r, t);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + p +
                ", Rate of Interest " + r +
                " and Time " + t);

        System.out.println("\n=== HANDSHAKES ===");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int result = handshakes(n);

        System.out.println("Maximum number of handshakes: " + result);

        System.out.println("\n=== TRIANGULAR PARK RUN ===");

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        double totalRounds = rounds(a, b, c);

        System.out.println("Number of rounds needed for 5km run: " + totalRounds);

        sc.close();
    }
}