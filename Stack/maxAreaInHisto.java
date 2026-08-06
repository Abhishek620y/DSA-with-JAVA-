import java.util.*;

public class maxAreaInHisto {
    public static void maxArea(int arr[]) {
        int maxArea = 0; 
        int nextsmallleft [] = new int[arr.length];
        int nextsmallright [] = new int[arr.length];


        // find nexr smaller right --> O(n)
        Stack <Integer> s = new Stack<>();
        for (int i=arr.length-1; i>=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { 
                s.pop();
            }

            if (s.isEmpty()) {
                nextsmallright[i] = arr.length;
            } else {
                nextsmallright[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left --> O(n)
        s = new Stack<>();
        for (int i=0; i<arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { 
                s.pop();
            }

            if (s.isEmpty()) {
                nextsmallleft[i] = -1;
            } else {
                nextsmallleft[i] = s.peek();
            }
            s.push(i);
        }


        // Current Area 
        for (int i =0; i<arr.length; i++) {
            int height = arr[i];
            int width = nextsmallright[i] - nextsmallleft[i] -1;

            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Maximum area of histogram is: " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};

        maxArea(arr);
    }
}