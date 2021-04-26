
package linkedlist;


public class LinkedList {

    public static void main(String[] args) {
        
      LinkedListClass ll = new LinkedListClass();
        ll.addInOrderAsc(7);
        ll.addInOrderAsc(5);
        ll.addInOrderAsc(1);
        ll.addInOrderAsc(2);
        ll.addInOrderAsc(3);
        ll.addInOrderAsc(3);
        ll.addInOrderAsc(9);
        ll.addInOrderAsc(8);
        System.out.println(ll.printList());        
        System.out.println(ll.printList());

    }
    
}
