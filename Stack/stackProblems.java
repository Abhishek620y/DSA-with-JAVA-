// Problem---1  Push at Bottom of stack  
/* 
import java.util.*;

public class stackProblems {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
*/


// problem --2  reverse a string using stack 
/* 
import java.util.*;

public class stackProblems {
    public static String reverseString(String str) {
        Stack <Character> s = new Stack<>();
        int index =0; 

        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abcd";

        String result = reverseString(str);
        System.out.println(result);   
    }
}
*/

// problem - Reverse the stack 
import java.util.*;

/* 
public class stackProblems {
    public static void pushAtBottom (Stack<Integer> s , int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack <Integer> s ) {
        if (s.isEmpty()) 
            return;

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void printStack (Stack <Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
    public static void main(String[] args) {

        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);   
    }
} 
*/



// problem -- stock span Problem 
/* 

import java.util.*;

public class stackProblems {
    public static void stockSpan(int stock[], int span[]) {
        Stack <Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i =1; i<stock.length; i++) {
            int currPrice = stock[i];

            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i- prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock [] = {100, 80, 60, 70, 60, 85, 100};
        int span [] = new int[stock.length];

        stockSpan(stock, span);

        for (int i=0; i<stock.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
*/

import java.util.*;

public class stackProblems {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};

        Stack <Integer> s = new Stack<>();

        int nextGreater [] = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i] ) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i]  = arr[s.peek()];
            }

            s.push(i);
        }
        
        for (int i=0; i<nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}

// next greater right 
// the above code 

// next greater left 
// change the for loop from 1 to n 


// next smaller right 
// change the while condition from less than to greater than 

// next smaller left 
// change the for loop from 1 to n with while condition from less than to greater than 