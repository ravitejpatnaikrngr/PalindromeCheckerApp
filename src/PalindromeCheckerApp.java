import java.util.Stack;

public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";
    public static void main(String[] args) {
                String word = "madam";
                System.out.println("Palindrome Checker App - UC5");
                System.out.println("Original String: " + word);
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < word.length(); i++) {
                    stack.push(word.charAt(i));
                }
                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed += stack.pop();
                }
                if (word.equals(reversed)) {
                    System.out.println("Result: The given string is a Palindrome.");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome.");
                }
                System.out.println("Program execution completed.");
            }
        }



