// write introduction notes from 55th video...

public class whileloop{
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
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
        display(a);
        System.out.println();
        display(a);
        // it prints twice if "head is used" but this does not work without head

    }
}