// write introduction notes from 55th video...

public class basics{
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
        b.next = c;
        System.out.println(b.data);
        System.out.println(b.next.data);

    }
}