import java.util.Scanner;

public class palindromeseq {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();

        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    // Recursive function to check palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        // base case: crossed pointers or single char left
        if (left >= right) {
            return true;
        }
        // mismatch case
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // recursive step
        return isPalindrome(s, left + 1, right - 1);
    }
}
