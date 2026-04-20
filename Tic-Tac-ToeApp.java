import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        int manualLength = getLengthWithoutMethod(text);
        int builtinLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtinLength);
        System.out.println("Lengths match: " + (manualLength == builtinLength));

        scanner.nextLine();
        System.out.print("\nEnter a sentence: ");
        String sentence = scanner.nextLine();

        String[] manualSplit = splitIntoWords(sentence);
        String[] builtinSplit = sentence.split(" ");

        boolean arraysMatch = compareStringArrays(manualSplit, builtinSplit);

        System.out.println("\nManual split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split:");
        for (String word : builtinSplit) {
            System.out.println(word);
        }

        System.out.println("\nArrays match: " + arraysMatch);

        scanner.close();
    }

    static int getLengthWithoutMethod(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    static String[] splitIntoWords(String s) {
        int wordCount = 1;
        for (int i = 0; i < getLengthWithoutMethod(s); i++) {
            if (s.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < getLengthWithoutMethod(s); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = s.substring(start);
        return words;
    }

    static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}



