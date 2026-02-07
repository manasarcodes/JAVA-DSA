import java.util.Scanner;
import java.util.Arrays;
public class finding_max{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,6,4,8,7};
        System.out.println(maxinarray(arr,0));
    }
    public static int maxinarray(int [] arr,int idx){
        // base case
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int smallAns = maxinarray(arr,idx+1);
        return Math.max(arr[idx],smallAns);
    }
}