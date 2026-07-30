class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
    
}
    public class DoublylinkedList{
        static Node head;
     static void insert(int data){
            Node newNode=new Node(data);
            if (head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next !=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }    
         static void deleteEnd(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
        }
        static void displayForward(){
            Node temp=head;
          
                
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
            
        }
           static void displayBackward(){
                if (head==null)
                return;
                Node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                while(temp.prev!=null)
                {
                    temp=temp.next;
                }
                while(temp.prev!=null)
                {
                    System.out.print(temp.data+"->");
                    temp=temp.prev;
                }
            }
                public static void main(String[]args){
                
                insert(10);
                insert(20);
                insert(30);
                System.out.println("Forword:");
                displayForward();
                deleteEnd();
                System.out.println();
                System.out.println();
                System.out.println("Delete at end");
                displayForward();
            }
        }
