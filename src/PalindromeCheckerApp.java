
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";
    public static void main(String[] args) {
                String word = "racecar";
                System.out.println("Palindrome Checker App - UC7");
                System.out.println("Original String: " + word);
                Deque<Character> deque = new ArrayDeque<>();
                for (int i = 0; i < word.length(); i++) {
                    deque.addLast(word.charAt(i));
                }
                boolean isPalindrome = true;
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();
                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("Result: The given string is a Palindrome.");
                } else {
                    System.out.println("Result: The given string is NOT a Palindrome.");
                }

                System.out.println("Program execution completed.");
            }
        }





