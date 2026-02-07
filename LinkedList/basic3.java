// write introduction notes from 55th video...

public class basic3{
    public static class Node{
        int data; // value
        Node next;// address of next value
        Node(int data){
            this.data = data;
        }
        

    }
    public static void main(String [] arg){
        Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(7);
        a.next = b;   // a → b
        b.next = c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        // using temp
        Node temp = a;
        System.out.println(temp.data);

        // using temp and for loop
        // Node temp = a;
        // print every element
        for(int i=0;i<=3;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}