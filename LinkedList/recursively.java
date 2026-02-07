// write introduction notes from 55th video...

public class recursively{
    public static void displayr(Node head){
        if(head==null){
            return;
        }
        // printing in order
        //System.out.println(head.data + " ");
        
        //displayr(head.next);
        // printing in reverse order
        displayr(head.next);
        System.out.println(head.data + " ");
    }
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
        a.next = b;
        b.next = c;
        displayr(a);
        

    }
}