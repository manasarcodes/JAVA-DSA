// write introduction notes from 55th video...

public class findinglength{
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
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
        length(a);
        System.out.println(length(a));
        // it prints twice if "head is used" but this does not work without head

    }
}