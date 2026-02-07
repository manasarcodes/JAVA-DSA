import java.util.Scanner;
import java.util.Arrays;
public class target{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int [] arr = {9,7,5,4};
        int target = 3;
        
        if(findingtarget(arr,target,0,arr.length)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean findingtarget(int [] arr,int target,int idx,int n){
        // base case
        if(idx >= n){
            return false ;
        }
        if(target == arr[idx]){
            return true;
        }
        return findingtarget(arr,target,idx+1,n);
        
        
        
        
        
    }
}