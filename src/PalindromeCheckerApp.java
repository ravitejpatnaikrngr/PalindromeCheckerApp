
public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";
    public static void main(String[] args) {
                String word = "radar";
                System.out.println("Palindrome Checker App - UC4");
                System.out.println("Original String: " + word);
                char[] characters = word.toCharArray();
                int start = 0;
                int end = characters.length - 1;
                boolean isPalindrome = true;
                while (start < end) {
                    if (characters[start] != characters[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }
                if (isPalindrome) {
                    System.out.println("Result: The given string is a Palindrome.");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome.");
                }

                System.out.println("Program execution completed.");
            }
        }


