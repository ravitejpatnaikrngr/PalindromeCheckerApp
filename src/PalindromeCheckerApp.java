import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Palindrome Checker App - UC11 (OOP Version)");
        System.out.println("=================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker(input);
        if (checker.checkPalindrome()) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}

class PalindromeChecker {
    private String original;

    public PalindromeChecker(String original) {
        this.original = original;
    }
    public boolean checkPalindrome() {

        String normalized = original.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}