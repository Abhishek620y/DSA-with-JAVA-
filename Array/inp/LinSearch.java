//       Linear Search

// Ques--  find the index of given number in array

// public class LinSearch {
//     public static int linerSearch(int number [], int  key) {
//         for (int i=0; i<number.length; i++) {
//             if (number[i]== key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args []) {
//         int number [] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key=54;

//         int index= linerSearch(number, key);

//         if (index ==-1) {
//             System.out.println("Not Found ");
//         } else {
//             System.out.println("Index of number is: " + index);        }
//     } 
    
// }

// Time Complexcity of Linear search is  "O(n)""



// Ques-- Find the largest number in given array

import java.util.*;
public class LinSearch {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;

        for ( int i=0; i<numbers.length; i++) {
            if (largest< numbers[i]) {
                largest= numbers[i];
            }
        }

        for (int i=0; i<numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest= numbers[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
        return largest;

    }
    public static void main (String args []) {
        int numbers [] = {1, 2, 5, 6, 3, 8, 4};

        System.out.println("Largest number is: " + getLargest(numbers));
    }
}

// Time Complexity of this ques is  "O(n)"