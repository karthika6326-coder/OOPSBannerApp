import java.util.Scanner;

public class FactorAndRecursionApp {

    public static int[] findFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        return s;
    }

    public static long product(int[] arr) {
        long p = 1;
        for (int i : arr) {
            p *= i;
        }
        return p;
    }

    public static long sumOfSquares(int[] arr) {
        long s = 0;
        for (int i : arr) {
            s += Math.pow(i, 2);
        }
        return s;
    }

    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] factors = findFactors(num);

        for (int i : factors) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + sum(factors));
        System.out.println(product(factors));
        System.out.println(sumOfSquares(factors));

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int recResult = recursiveSum(n);
            int formulaResult = formulaSum(n);

            System.out.println(recResult);
            System.out.println(formulaResult);

            if (recResult == formulaResult) {
                System.out.println("Match");
            } else {
                System.out.println("Mismatch");
            }
        }

        sc.close();
    }
}