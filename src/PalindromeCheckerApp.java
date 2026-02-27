import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";
    public static void main(String[] args) {
                String word = "level";  // You can modify this
                System.out.println("=================================");
                System.out.println("Palindrome Checker App - UC6");
                System.out.println("=================================");
                System.out.println("Original String: " + word);
                Stack<Character> stack = new Stack<>();
                Queue<Character> queue = new LinkedList<>();
                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    stack.push(ch);
                    queue.add(ch);
                }
                boolean isPalindrome = true;

                while (!stack.isEmpty()) {

                    char fromStack = stack.pop();
                    char fromQueue = queue.remove();

                    if (fromStack != fromQueue) {
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




