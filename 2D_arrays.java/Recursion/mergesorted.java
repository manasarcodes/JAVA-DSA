import java.util.Scanner;
public class mergesorted{
    public static void displayarr(int [] arr){
        for(int val : arr){
            System.out.println(val + " ");
        }
    }
    public static void merge(int [] arr , int l , int mid , int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int [] left = new int[n1];
        int [] right = new int [n2];
        int i;
        int j;
        int k;
        for(i = 0 ; i<=n1 ; i++){
            left[i] = arr[l++];
            for(j =0 ; j<=n2 ; j++){
                right[j] = arr[mid + 1 + j];
            }
            i = 0;
            j = 0 ;
            k = l;
            while(i < n1 && j < n2){
                if(left[i] <= right[j]){
                    arr[k++] = left[i++];
                }
                else{
                    arr[k++] = right[j++];
                }
                while(i<n1){
                    arr[k++] = left[i++];
                }
                while(j<n2){
                    arr[k++] = right[j++];
                    
                }
            }
        }
        int arr[] = {2,3,5,6,4,8};
                int n = arr.length;
                System.out.println("Array before sorting");
                displayarr(arr);
                mergeSort(arr,0,n-1);
                System.out.println("Array after sorting");
                displayarr(arr);
    }
    
    
    
        public static void mergeSort(int[]arr,int l , int r){
            if(l>=r) return;
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            mergeSort(arr,l,mid,r);
            
        }
    

    
}