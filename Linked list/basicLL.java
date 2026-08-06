public class basicLL {
    public static class Node {
        int data; 
        Node next;

        // Constructor
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Define head and tail of Linked List 
    public static Node head;
    public static Node tail;

    // define static size to avoid loop traverse for calculate the size of linked list 
    public static int size;
    
    // add element add at starting of linked list  
    public void addFirst (int data) {
        //step 1 = create a new node 
        Node newNode = new Node(data);
        size++;

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 => new node next = head
        newNode.next = head; // link the new Node to linked list

        // step 3 => new node = head
        head = newNode;
    }

    // add elemnt at last of linked list
    public void addLast (int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }
    
    // print the all element of linked list 
    public void printLinkedlist () {
        // if this line is not written then automatically it print "Null"
        if (head ==null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // add element at specific index of linked list 
    public void addAtIndex (int indx, int data) {

        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i =0; 
        while (i < indx-1) {
            temp = temp.next;
            i++;
        }

        // i = indx-1 -> prev  
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first element of linked list 
    public int removeFirst() {
        //case 1
        if (size == 0) {
            System.out.println("Linked list is empty");
            
            return Integer.MIN_VALUE;
        
            // case 2
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        //case 3
        int val = head.data; 
        head = head.next;
        size--;
        return val;
    }
    
    // Remove last element from linked list 
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        } else  if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        // prev : i = size-2
        Node prev = head;
        for (int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // means value of tail.data 
        prev.next = null; 
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        // object of basicLL class 
        basicLL ll = new basicLL();
        //ll.printLinkedlist();

        ll.addFirst(2);
        //ll.printLinkedlist();

        ll.addFirst(1);
        //ll.printLinkedlist();

        ll.addLast(3);
        //ll.printLinkedlist();

        ll.addLast(4);

        ll.addAtIndex(2, 9);
        
        ll.printLinkedlist();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.printLinkedlist();
        System.out.println(ll.size);
        //System.out.println();

        ll.removeLast();
        ll.printLinkedlist();
        System.out.println(ll.size);
    }

}

// Time Complexity of Addfirst is O(1)

// Time Complexity of Addlast is O(1)

// Time complexity of PrintLinkedList is O(n)

// Time complexity of addAtIndex is O(n) 