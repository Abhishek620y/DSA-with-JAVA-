public class reverseLL {
    public class Node {
        int data;
        Node next;

        // constuctor 
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addElement() {
        Node temp = null;

        for (int i =1; i<=5; i++) {
            Node newNode = new Node(i);

            if (head == null) {
                head = newNode;
            } else {
                temp.next = newNode;
            }

            temp = newNode;
            size ++;
        }

    }

    public void printElement () {
        Node temp = head;

        if (head == null ) {
            System.out.println("Linked list is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NUll");

    }

    public void iterativeReverseLL() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        } else if (head.next == null) {
            System.out.println(head.data);
            return;
        }

        Node curr = tail = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public Node recursivereverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = recursivereverseLL(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        reverseLL ll = new reverseLL();

        ll.addElement();
        ll.printElement();;

        System.out.println(ll.size);

        // ll.iterativeReverseLL();
        // ll.printElement();

        ll.head = ll.recursivereverseLL(ll.head);
        ll.printElement();
    }
    
}
