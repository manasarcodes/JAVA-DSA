public class implementation{
    public static void main(String [] arg){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd (4);
        ll.insertAtEnd (2); 
        ll.display();
        System.out.println();
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

            void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
           // System.out.println();
            
        
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
}
