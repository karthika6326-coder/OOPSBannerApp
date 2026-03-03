import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {
        convertCelsiusToFahrenheit();
        convertFahrenheitToCelsius();
    }

    public static void convertCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double farenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");
    }

    public static void convertFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}