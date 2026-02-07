public class inserting{
    public static class linkedlist{
        Node head = null;
        Node tail = null;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String [] arg){
        linkedlist ll = new linkedlist();
        ll.add(4);
        ll.add(5);
        ll.size();
    }
}