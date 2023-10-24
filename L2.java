public class L2 {
    Node head;
    
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            next=null;
        }}
        public void addFirst(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void printList(){
            if(head==null)
            {
                System.out.println("List is Empty!");
                return;
            }
            Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
            System.out.println("NULL");
        }
    public static void main(String[] args) {
        L2 list=new L2();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();
    }
}