public class creatinganarraylist{
    public static class ArrayList{
        int [] arr = new int[2];
        int size = 0;
        int idx = 0;
        public void add(int ele){
            arr[size] = ele;
            idx++;
            size++;
        }
    }
    public static void main(String [] arg){
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(3);
        System.out.println(arr.size);
    }
}