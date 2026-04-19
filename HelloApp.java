import java.util.Scanner;

public class DigitFrequencySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] freq = new int[10];

        int temp = number;

        if (temp == 0) {
            freq[0] = 1;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                freq[digit]++;
                temp /= 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}