// optimizing the bubble sort in the case of nearly sorted arrays
public class bubblesort2{
    public static void bubbleSort(int [] a){
        int n = a.length;

        for(int i = 0 ; i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-1-i;j++){
                if(a[j] > a[j+1]){
                    // swap = a[j] , a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                return ;
            }
        }
    }
    public static void main(String [] arg){
        int [] a = {1,5,3,6,9};
        bubbleSort(a);
        for(int i : a){
            System.out.println(i);
        }
    }
}