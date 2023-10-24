public class LL {
    Node head;
    private int size;
    LL() {
        size=0;
    }
    public int getsize(){
        return size;
    }
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data; 
            size++;  
        }
    }

    public void addFirst(String data) {
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    
    public void addLast(String data) {
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;  
        }
            currNode.next=newnode;
    }

    // public void addPos(String data, int idx)
    // {
    //     Node newNode=new Node(data);
    //     if(head==null)
    //     {
    //         System.out.println("List is Empty Your Node placed at First place !");
    //         head=newNode;
    //     }
    //     Node FirstNode=head;`
    //     Node secondNode=head.next;
    //     while(secondNode.next!=null)
    //     {

    //     }
    // }

    public void delFirst(){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }
        size--;
        head=head.next; 
    }

    public void delLast(){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }
        size--; 
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    
    public void printList(){
        Node currNode;
        currNode=head;
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");  
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        System.out.println(list.getsize());
        list.delFirst();
        list.printList();
        System.out.println(list.getsize());
        list.delLast();
        list.printList();
        System.out.println(list.getsize());

  

    }
    
}
