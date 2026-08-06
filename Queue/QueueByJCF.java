import java.util.*;

public class QueueByJCF {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();

        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();   
        }   
    }
}

// Queue is a interface in java collection framework 
// here we can create a object of QUeue because Queue is interface 
//Queue is implimented by two class 
// 1. LinkedLIst
// 2. Arraydeque