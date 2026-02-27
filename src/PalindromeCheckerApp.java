import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Palindrome Checker App - UC10");
        System.out.println("=================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String normalized = normalizeString(input);
        if (isPalindrome(normalized)) {
            System.out.println("Result: The given string is a Palindrome (case & spaces ignored).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome (case & spaces ignored).");
        }

        scanner.close();
    }
    public static String normalizeString(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

        return str;
    }
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}