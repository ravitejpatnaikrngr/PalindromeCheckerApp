
public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";
    public static void main(String[] args) {
                String word = "madam";

                System.out.println("=================================");
                System.out.println("Palindrome Checker App - UC2");
                System.out.println("=================================");

                System.out.println("Given Word: " + word);

                // Reverse the string
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }

                // Conditional check using if-else
                if (word.equals(reversed)) {
                    System.out.println("Result: The given word is a Palindrome.");
                } else {
                    System.out.println("Result: The given word is NOT a Palindrome.");
                }

                System.out.println("Program executed successfully. Exiting...");
            }
        }
