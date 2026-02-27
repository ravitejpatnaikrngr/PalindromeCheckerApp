
public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";
    public static void main(String[] args) {
                String word = "level";
                System.out.println("=================================");
                System.out.println("Palindrome Checker App - UC3");
                System.out.println("=================================");
                System.out.println("Original String: " + word);
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed = reversed + word.charAt(i);
                }
                System.out.println("Reversed String: " + reversed);
                if (word.equals(reversed)) {
                    System.out.println("Result: The given string is a Palindrome.");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome.");
                }
                System.out.println("Program execution completed.");
            }
        }

