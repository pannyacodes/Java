import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombinations {

    // Mapping of digits to corresponding letters
    static String[] keypad = {
        "",      // 0 (no mapping)
        "",      // 1 (no mapping)
        "abc",   // 2
        "def",   // 3
        "ghi",   // 4
        "jkl",   // 5
        "mno",   // 6
        "pqrs",  // 7
        "tuv",   // 8
        "wxyz"   // 9
    };

    // Function to generate keypad combinations
    public static ArrayList<String> getCombinations(String digits) {
        // Base case: if no digits, return an empty list
        if (digits.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Get the current digit and the rest of the string
        char currentDigit = digits.charAt(0);
        String remainingDigits = digits.substring(1);

        // Recursively find combinations for the remaining digits
        ArrayList<String> smallerCombinations = getCombinations(remainingDigits);

        // Get the corresponding characters for the current digit
        String charsForCurrentDigit = keypad[currentDigit - '0'];

        // Generate all combinations
        ArrayList<String> result = new ArrayList<>();
        for (char ch : charsForCurrentDigit.toCharArray()) {
            for (String str : smallerCombinations) {
                result.add(ch + str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        // Get combinations and print them
        ArrayList<String> combinations = getCombinations(input);
        System.out.println("Possible combinations:");
        for (String combination : combinations) {
            System.out.print(combination);
        }
        scanner.close();
    }
}