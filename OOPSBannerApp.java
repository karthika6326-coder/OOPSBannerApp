import java.util.Scanner;

public class CombinedProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Voting Eligibility (10 Students)");
            System.out.println("2. Number Analysis (5 Numbers)");
            System.out.println("3. Multiplication Table");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int[] age = new int[10];

                    for (int i = 0; i < age.length; i++) {
                        System.out.print("Enter age of student " + (i + 1) + ": ");
                        age[i] = sc.nextInt();

                        if (age[i] < 0) {
                            System.out.println("Invalid age");
                        } else if (age[i] >= 18) {
                            System.out.println("The student with the age " + age[i] + " can vote.");
                        } else {
                            System.out.println("The student with the age " + age[i] + " cannot vote.");
                        }
                    }
                    break;

                case 2:
                    int[] numbers = new int[5];

                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        numbers[i] = sc.nextInt();

                        if (numbers[i] > 0) {
                            if (numbers[i] % 2 == 0)
                                System.out.println(numbers[i] + " is positive and even");
                            else
                                System.out.println(numbers[i] + " is positive and odd");
                        } else if (numbers[i] < 0) {
                            System.out.println(numbers[i] + " is negative");
                        } else {
                            System.out.println("Zero");
                        }
                    }

                    if (numbers[0] == numbers[4])
                        System.out.println("First and last elements are equal");
                    else if (numbers[0] > numbers[4])
                        System.out.println("First element is greater than last element");
                    else
                        System.out.println("First element is less than last element");

                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    int[] table = new int[10];

                    for (int i = 1; i <= 10; i++) {
                        table[i - 1] = num * i;
                    }

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " * " + i + " = " + table[i - 1]);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
