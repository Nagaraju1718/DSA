class Node
{
    int data;
    Node next;
}
public class LinkedListImp
{
    Node head;
    int size;
    public LinkedListImp()
    {
        head=null;
        size=0;
    }
    public void insertatStart(int ele)
    {
        Node n=new Node();
        n.data=ele;
        if(head==null)
        {
            head=n;
            head.next=null;
        }
        else{
            n.next=head;
            head=n;
        }
        size++;
    }
    public void insertEnd(int ele)
    {
        Node n=new Node();
        Node temp;
        n.data=ele;
        //temp=head;
        if(head==null)
        {
            head=n;
            temp=head;
            temp.next=null;
        }
        else{
            temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            
            temp.next=n;
            temp.next.next=null;
        }
        size++;
    }
    public void insertMiddle(int ele,int pos)
    {
        Node temp;
        int i=1;
        if(pos>size)
        System.out.println("Invalid position");
        else{
            Node n=new Node();
            temp=head;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            n.data=ele;
            n.next=temp.next;
            temp.next=n;
            size++;
        }
    }
    public void deleteStart()
    {
        Node deleted;
        if(head==null)
        System.out.println("No Nodes");
        else{
            deleted=head;
            System.out.println("Deleted: "+deleted.data);
            head=deleted.next;
            size--;
        }
    }
    public void deleteEnd()
    {
        Node current;
        if(head==null)
        System.out.println("No Nodes");
        else{
            current=head;
            while(current.next.next!=null)
            current=current.next;
            System.out.println("Deleted: "+current.next.data);
            current.next=null;
            size--;
        }
    }
    public void deleteMiddle(int pos){
        int i=1;
        if(head==null)
        System.out.println("No Nodes");
        else{
            Node current=head,deleted;
            while(i<pos-1)
            {
                current=current.next;
                i++;
            }
            deleted =current.next;
            System.out.println("deleted: "+deleted.data);
            current.next=current.next=current.next.next;

        }
    }
    public void traverse()
    {
        Node current=head;
        while(current.next!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(current.data);
    }
   public static void main(String[] args) {
        LinkedListImp ll=new LinkedListImp();
        ll.insertatStart(10);
        ll.insertatStart(20);
        ll.insertatStart(30);
        ll.insertEnd(40);
        ll.insertEnd(50);
        ll.insertMiddle(60,3);
        ll.deleteEnd();
        ll.deleteStart();
        ll.deleteStart();
        ll.deleteMiddle(2);
        ll.traverse();
        
        //ll.insertEnd(10);
    }
}