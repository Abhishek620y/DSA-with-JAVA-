public class  zigZag{
    public class Node {
        int data; 
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst (int data) {
        // create newNode 
        Node newNode = new Node(data);

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode next = head 
        newNode.next = head;

        // head = newNode
        head = newNode;
    }

    public void printLL () {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public Node getMid (Node head) {
        Node slow = head;
        Node fast = head;

        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public void zigZagLL () {
        // find mid 

        Node mid = getMid(head);

        // reverse 2nd half 
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextleft, nextright;

        // alternate merging / zig zag merge
        
        while (left != null && right != null) {
            nextleft = left.next;
            left.next = right;
            nextright = right.next;
            right.next = nextleft;

            left = nextleft;
            right = nextright;
        }
    }
        
    public static void main(String[] args) {
        zigZag ll = new zigZag();

        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printLL();
        ll.zigZagLL();
        ll.printLL();

    }    
}


// Time complexity = O(nlogn)                                      