
import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Palindrome Checker App - UC12 (Strategy Pattern)");
        System.out.println("=================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        System.out.println("\nChoose Palindrome Algorithm:");
        System.out.println("1. Two-Pointer Strategy");
        System.out.println("2. Stack-Based Strategy");
        System.out.println("3. Deque-Based Strategy");

        int choice = scanner.nextInt();
        PalindromeStrategy strategy;

        switch (choice) {
            case 1:
                strategy = new TwoPointerStrategy();
                break;
            case 2:
                strategy = new StackStrategy();
                break;
            case 3:
                strategy = new DequeStrategy();
                break;
            default:
                System.out.println("Invalid choice, defaulting to Two-Pointer Strategy");
                strategy = new TwoPointerStrategy();
        }

        boolean result = strategy.isPalindrome(input);
        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}

interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String str) {
        // Normalize: lowercase + remove non-alphanumeric
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
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

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String str) {
        // Normalize
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String str) {
        // Normalize
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}