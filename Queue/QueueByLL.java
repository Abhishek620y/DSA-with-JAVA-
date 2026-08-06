public class QueueByLL {
    static class  Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {   // ----> O(1)
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            }

            // here we add element at last of LL
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {  // ---- > O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.data;
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        public static int peek() {  // ----> O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(3);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
