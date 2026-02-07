import java.util.Scanner;
public class hcf{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        int result = findinghcf(n1,n2);
        System.out.println(result);
    }
    public static int findinghcf(int n1 , int n2){
        // base case
        if(n2==0){
            return n1;
        }
        return findinghcf(n2,n1%n2);
        
    } 
}