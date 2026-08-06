import java.util.*;

public class NextGreaterele {
    public static void nextGreaterEle (Stack<Integer> s, int arr[], int nxtGreater [] ) {
        for (int i = arr.length-1; i>=0; i-- ) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
         int nxtGreater [] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        nextGreaterEle(s, arr, nxtGreater);

        for (int i =0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
    }
}
