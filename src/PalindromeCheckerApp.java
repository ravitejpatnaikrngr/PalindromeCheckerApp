
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Palindrome Checker App - UC9");
        System.out.println("=================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: crossed pointers or single character
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}