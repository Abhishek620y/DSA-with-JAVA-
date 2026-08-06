public class mergeSort {
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

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            
        }
        return slow;  // mid node

    }

    public Node mergePart (Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null)  {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort (Node head) {
        // base case 
        if (head == null || head.next == null ){
            return head;
        }

        // find mid 
        Node mid = getMid(head);

        // call mergeSort for left and right half 
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge both half 
        return mergePart (newLeft, newRight);
    }
        
    
    public static void main(String[] args) {
        mergeSort ll = new mergeSort();

        ll.addFirst(1);
        ll.addFirst(6);
        ll.addFirst(3);
        ll.addFirst(9);
        ll.addFirst(2);

        ll.printLL();

        ll.head = ll.mergeSort(ll.head);
        ll.printLL();

    }    
}


// Time complexity = O(nlogn)                                      