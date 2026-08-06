public class DoubleLL {
    public class Node {
        int data; 
        Node next; 
        Node prev;

        public Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static Node head; 
    public static Node tail;
    public static int size;

    // Add First in Doubly Linked list 
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add Last in douly LL
    public void addLast (int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    // Remove first in Doubly LL
    public int removeFirst() {
        if (head == null) {
            System.out.println("Linked is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;

        size--;
        return val;
    }

    // removeLast in Doubly LL
    public int removeLast() {
        // case 1 -- if element = 0 
        if (head == null) {
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        } 

        // case 2 -- element 1
        if (size == 1) {
            int val =head.data;
            head = tail = null;
            size--;
            return val;
        }

        // case 3 -- if elemnet more than 2

        Node prevoftail = head;
        for (int i=0; i<size-2; i++){
            prevoftail = prevoftail.next;  
        }

        int val = prevoftail.next.data;  // means data od tail
        prevoftail.next = null;
        tail.prev = null;

        tail = prevoftail;
        size --;

        return val;
    }

    // print liked list
    public void printLL () {
        if (head == null) {
            System.out.println("Linked is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.err.println("NULL");
    }

    // Reverse the doubly LL
    public void reverseLL () {
        if (head == null) {
            System.out.println("Linked list is empty ");
            return;
        }

        if (head.next == null) {
            System.err.println(head.data);
            return;
        }

        Node curr = head;
        Node prevNode = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prevNode;
            curr.prev = next;


            prevNode = curr;
            curr = next;
        }
        head = prevNode; 
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printLL();
        System.err.println(dll.size);

        // dll.removeLast();
        // dll.printLL();

        // System.err.println(dll.size);

        // dll.addLast(5);
        // dll.printLL();
        // System.err.println(dll.size);

        // dll.removeLast();
        // dll.printLL();
        // System.out.println(dll.size);

        dll.reverseLL();
        dll.printLL();
    }
    
}
