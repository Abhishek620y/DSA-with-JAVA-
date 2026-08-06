import java.util.*;

public class duplicateParenthesis {
    public static boolean foundDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i= 0; i<str.length(); i++) {

            char ch = str.charAt(i);

            // closing 
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                } 

                 if (count < 1) {
                return true; // duplicate found 
                } else {
                    s.pop(); // opening pair 
                }
            } else {
                // opening condition 
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "((a + b) + (c + d))";

        String str2 = "((a + b))";
        System.out.println(foundDuplicate(str2));
    }
}

// Time Complexity = O(n)