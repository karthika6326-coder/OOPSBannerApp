import java.util.HashMap;
public class OOPSBannerApp {

    public static void main(String[] args) {
        calculateHarryAge();
        calculateSamAverage();
        convertDistance();
        calculateProfit();
    }

    public static void calculateHarryAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }

    public static void calculateSamAverage() {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }

    public static void convertDistance() {
        double km = 10.8;
        double miles = km * 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    public static void calculateProfit() {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f\n" +
                          "The Profit is INR %.0f and the Profit Percentage is %.2f%%\n", 
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}