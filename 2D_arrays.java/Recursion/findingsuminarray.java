import java.util.Scanner;
public class findingsuminarray{
    public static int sumofarray(int [] arr , int idx ){
    // base case
    if(idx==arr.length){
        return 0;
    }
    // recursive work
    int smallAns = sumofarray(arr,idx + 1);
    
    // return 
    return smallAns + arr[idx];

    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,5,6,10};
        System.out.println(sumofarray(arr,0));
    }
}