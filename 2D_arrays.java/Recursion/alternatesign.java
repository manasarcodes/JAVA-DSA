import java.util.Scanner;
public class alternatesign{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        
        int result = alternate_sign(n);
        System.out.println(result);
    }
    public static int alternate_sign(int n){
        // base work
        if(n==0){
            return 0;
        }
        // recursive work
        
        if(n%2!=0){
            return alternate_sign(n-1)+n;
        }
        else{
            return alternate_sign(n-1)-n;
        }
        
    }
}