import java.util.Scanner;

public class method2 {
    public static void removestring(String s, int idx, StringBuilder result) {
        // base case
        if (idx == s.length()) {
            return;
        }

        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a') {
            result.append(currChar); // O(1)
        }

        // recursive work
        removestring(s, idx + 1, result);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();

        StringBuilder result = new StringBuilder();
        removestring(s, 0, result);

        System.out.println("After removing 'a': " + result.toString());
    }
}