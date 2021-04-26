
package linkedlist;

public class LinkedListClass {
    private Node head;
    
    public LinkedListClass(){
        head=null;
    }
    
    public void addFront(int item){
        Node newNode = new Node(item); // step 1
        newNode.next=head;             // step 2
        head=newNode;                  // step 3
    }
    
    public void addLast(int item){
        
        Node newNode = new Node(item);       
        if (head==null){   // case 1
            head=newNode;
            return;
        }
        Node curr=head;     //cases 2 and 3
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    
    public void addInOrderAsc(int item){
        Node newNode = new Node(item);  
        if (head==null || head.data>item){ //add Front
            newNode.next=head;
            head=newNode;
            return;
        }
        
        Node curr,prev;
        curr=prev=head;    
        while(curr!=null && curr.data<item){
            prev=curr;
            curr=curr.next;
        }
        newNode.next=curr;
        prev.next=newNode;    
    } 
    
    
    public boolean delete(int key){

        Node curr,prev;
        curr=prev=head;
        
        while(curr!=null && curr.data!=key){
            prev=curr;
            curr=curr.next;
        }
        
        if(curr==null){
            return false;
        }
        
        if(curr==head){
            head=curr.next;
            return true;
        }
        
        prev.next=curr.next;
        return true;
    }
    
    
    
    public String printList(){
        String s="List: ";
        Node curr= head;
        while (curr!=null){
            s+=curr.data+" ";
            curr=curr.next;
        }
        return s;
    }
}
   
 