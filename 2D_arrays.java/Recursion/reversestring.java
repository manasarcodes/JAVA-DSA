import java.util.Scanner;
import java.util.Arrays;
public class reversestring{
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        System.out.println(reversing(0,s));
    }
    public static String reversing(int idx,String s){
        if(idx==s.length()){
            return "";
        }
        String SmallAns = reversing(idx+1,s);
        char currChar = s.charAt(idx);
        return SmallAns + currChar;
    }
}