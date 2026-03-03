import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {
        checkLeapYearNested();
        checkLeapYearLogical();
    }

    public static void checkLeapYearNested() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Year must be 1582 or later");
        }
    }

    public static void checkLeapYearLogical() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("Year must be 1582 or later");
        }
    }
}