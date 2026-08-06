import java.util.LinkedList;

// OR import java.util.*;

public class LLcollectonFrame {

    public static void main(String[] args) {
        // Create 
        LinkedList<Integer> ll = new LinkedList<>();

        // add element
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(3);

        System.out.println(ll);
        
        // remove element 
        ll.removeFirst();
        ll.removeLast();

        // print the Linked list 
        System.out.println(ll);
        
    }
}
