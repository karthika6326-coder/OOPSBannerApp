import java.util.Scanner;

public class StringComparisonDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Task 1: Compare two strings ---
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean charAtCompare = compareStrings(str1, str2);
        boolean equalsCompare = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + charAtCompare);
        System.out.println("Comparison using equals(): " + equalsCompare);
        System.out.println("Results match: " + (charAtCompare == equalsCompare));

        // --- Task 2: Substring creation ---
        System.out.print("\nEnter a string for substring: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String manualSubstring = createSubstring(text, start, end);
        String builtinSubstring = text.substring(start, end);

        System.out.println("Manual substring: " + manualSubstring);
        System.out.println("Built-in substring: " + builtinSubstring);
        System.out.println("Substrings match: " + compareStrings(manualSubstring, builtinSubstring));

        // --- Task 3: Convert to char array ---
        System.out.print("\nEnter a string to convert to char array: ");
        String arrayText = scanner.next();

        char[] manualArray = toCharArrayManual(arrayText);
        char[] builtinArray = arrayText.toCharArray();

        boolean arraysMatch = compareCharArrays(manualArray, builtinArray);

        System.out.println("Manual char array: " + new String(manualArray));
        System.out.println("Built-in char array: " + new String(builtinArray));
        System.out.println("Arrays match: " + arraysMatch);

        scanner.close();
    }

    // Compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Create substring manually using charAt()
    static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Convert string to char array manually
    static char[] toCharArrayManual(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}



