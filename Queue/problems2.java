/* 

// Ques.-- Interleave two halves of Queue (Even lenght)
import java.util.*;

public class problems2 {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        
        int size = q.size();

        for (int i = 0; i<size/2; i++){
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
            
        }
    }
}

*/

/* 
// Ques.-- Reverse a Queue

import java.util.*;

public class problems2 {
    public static  void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s1 = new Stack<>();

        while(!q.isEmpty()) {
            s1.push(q.remove());
        }
        
        while (!s1.isEmpty()) {
            q.add(s1.pop());            
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}

Time Complexity and Space Complxity -- O(n) 
*/


import java.util.*;

public class problems2 {
    public static void main(String[] args) {
        
    }

}