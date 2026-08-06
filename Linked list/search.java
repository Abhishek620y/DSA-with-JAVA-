public class search {
    public class Node {
        int data;
        Node next;

        // constructor 
        public Node (int data) {
            this.data = data;
            this.next = null;
        }

    }
    
    public  Node head;
    public  Node tail;
    //public  int size;

    public void addelement() { 
        Node temp = null;

        for (int i=1; i<=5; i++){
            Node newNode = new Node(i);

            if (head == null) {
            head = newNode;
            } else {
                temp.next = newNode;
            }
            temp = newNode;
        }

    }
    public void printElemnt () {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Iterative Search 
    // Search for key in Linked list. Return the position where it is found. If not found, return -1.
    public int iterativeSearch(int key) {  // Time complexity = O(n) Linear search 
        int indx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                //System.err.println(indx);
                return indx; 
            } 
            temp = temp.next;
            indx++;
        }
        // Key not found
        return -1;
    }

    // Recursive Search 
    public int helper (Node head, int key) {  // Time complexity = O(n)
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx+1;

    }

    public int recursiveSearch (int key) {
        return helper(head, key);

    }

    public static void main(String[] args) {
        search ll = new search();
        ll.addelement();
        ll.printElemnt();

       //int key = 4;
        // System.out.println(ll.iterativeSearch(4));
        // System.err.println(ll.iterativeSearch(10));

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(20));
    }
}
