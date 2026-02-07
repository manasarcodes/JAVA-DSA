import java.util.Scanner;
public class reverse{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();
        int pw = 1;
        int ans = 0;
        while(binary_num>0){
            
            int unit_digit = binary_num % 10;
            binary_num/=10;
            ans = ans + unit_digit*pw;
            pw *= 2;
        }
        System.out.print(ans);
    }
}