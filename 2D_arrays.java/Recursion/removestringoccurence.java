import java.util.Scanner;
public class  removestringoccurence{
    public static String removestring(String s,int idx){
        // base case
        if(idx==s.length()){
            return " " ;
        }
        // recursive work
        String SmallAns = removestring (s,idx+1);
        char currChar = s.charAt(idx);

        // self work
        if(currChar != 'a'){
            return currChar + SmallAns;
        }
        
        return SmallAns;
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        System.out.println(removestring(s,0));
    }
}