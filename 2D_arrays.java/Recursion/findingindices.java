import java.util.Scanner;
import java.util.ArrayList;
public class findingindices{
    public static void main(String [] arg){
    Scanner sc = new Scanner(System.in);
    int [] arr = {1,2,3,5,2,3};
    int target = 3;
    int n= arr.length;
    ArrayList<Integer>ans = allIndices(arr,n,target,0);
    System.out.println(ans);
    }
    public static ArrayList<Integer>allIndices(int [] arr , int n,int target ,int idx){
        ArrayList < Integer > ans = new ArrayList<>();
         
        // base case
        if(idx >= n){
            return new ArrayList<Integer>(); // return empty array
        }
        
        //self work
        if(arr[idx] == target ){
            ans.add(idx);
            
        }
        // recursive work
        ArrayList<Integer>SmallAns = allIndices(arr,n,target,idx+1);
        ans.addAll(SmallAns);
        return ans;
    }
}