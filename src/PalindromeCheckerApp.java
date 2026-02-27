import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Palindrome Checker App - UC13 (Performance Comparison)");
        System.out.println("=================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Map<String, Long> results = new LinkedHashMap<>();
        long start = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(normalized);
        long end = System.nanoTime();
        results.put("Two-Pointer", end - start);
        start = System.nanoTime();
        boolean stackResult = stackPalindrome(normalized);
        end = System.nanoTime();
        results.put("Stack", end - start);
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(normalized);
        end = System.nanoTime();
        results.put("Deque", end - start);
        start = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(normalized, 0, normalized.length() - 1);
        end = System.nanoTime();
        results.put("Recursive", end - start);
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Two-Pointer: " + twoPointerResult);
        System.out.println("Stack: " + stackResult);
        System.out.println("Deque: " + dequeResult);
        System.out.println("Recursive: " + recursiveResult);

        System.out.println("\nExecution Time (nanoseconds):");
        results.forEach((key, value) -> System.out.println(key + ": " + value));

        scanner.close();
    }
    public static boolean twoPointerPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }
}