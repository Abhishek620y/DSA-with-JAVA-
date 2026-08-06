//package Queue;
/* 
public class QueueByArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {  // Constructor 
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // adding elements --- > O(1)
        public static void addElements(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // Removing Elements ---> O(n)
        public static int removeElements() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for (int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        // peek ---> O(1)
        public static int peekElements() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.addElements(1);
        q.addElements(2);
        q.addElements(3);

        while (!q.isEmpty()) {
            System.out.println(q.peekElements());
            q.removeElements();
            
        }
    }
}

// Time Complexity Of AddElements --> O(1)

// Time Complexity Of removeElements --> O(n)

*/

// Circular Array in Queue 

public class QueueByArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {  // Constructor 
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void addElement(int data) {  // ---> O(1)
            if (isFull()) {
                System.out.println("Queue is Full");
            }

            // add first element 
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {  // ----> O(1)  here in remove function time complexity is change from O(n) to O(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {  // ---> O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.addElement(1);
        q.addElement(2);
        q.addElement(5);

        System.out.println(q.remove());
        q.addElement(6);
        System.out.println(q.remove());
        q.addElement(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}

