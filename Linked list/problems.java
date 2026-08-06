/* 

public class problems {
    public class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // public void addElement () {
    //     Node temp = null;

    //     for (int i =1; i<=5; i++) {
    //         Node newNode = new Node(i);

    //         if (head==null) {
    //             head = newNode;
                
    //         } else {
    //             temp.next = newNode; 
    //         }
    //         temp = newNode;
    //     }
    // }

    public void printElement () {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeNthFromEnd (int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;  // removefirst
            return;
        }

        int indx = 1;
        int indxToFind = size - n;

        Node prev = head;
        while (indx < indxToFind) {
            prev = prev.next;
            indx++;
        }

        prev.next = prev.next.next;
        return;

    }

    // Find the mid of linked list by Slow-Fast approach 

    // Slow = it moves 1 step at a time
    // fast = iot move 2 step at a time 

    public Node findMid(Node head) {
        Node slow = head; 
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // slow is a my nid element of the Linked list
    } 

    public boolean checkPalidrome () {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 -> find mid of lInked list
        Node midNode = findMid(head);

        // step 2 -> reverse right half of linked list
        Node prev = null;
        Node curr = midNode;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
             curr = next;
        }

        // step 3 -> check left half & right half
        Node right = prev;  // rigth half head
        Node left = head;  // left half head

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        problems ll = new problems();

        //ll.addElement();
        //ll.printElement();

        //ll.removeNthFromEnd(3);
        //ll.printElement();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        //ll.addFirst(1);

        ll.printElement();
        //ll.findMid(null);
        System.out.println(ll.checkPalidrome());
        
        
    }
    
}
*/


/* 
// Floyd’s Cycle Detection Algorithm (Tortoise & Hare) 

// Problems --> Detect a cycle in a linked list 

public class problems {
    public static class Node  {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle () {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null ) {
            slow = slow.next; // +1 step
            fast = fast.next.next;  // +2 step

            if (slow == fast) {
                return true;  // cycle exits
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
    }
}
*/

public class problems {
    public static class Node  {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle () {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null ) {
            slow = slow.next; // +1 step
            fast = fast.next.next;  // +2 step

            if (slow == fast) {
                return true;  // cycle exits
            }
            
        }
        return false;
    }

    public static void removeCycle() {
        // detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast){
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // second meetind point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last node.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}