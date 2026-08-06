//package Sorting;

import java.util.Arrays;

public class inbuiltsort {
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
    public static void main (String args []) {
        int arr[] = {5, 4, 1, 3, 2, 1, 5, 3, 6};

        Arrays.sort(arr);

        // for index range 
        //Arrays.sort(arr, 0, 3);

        printArr(arr);
    }
    
}

// import java.util.Collections;
// import java.util.Arrays;

// public class inbuiltsort {
//     public static void printArr(Integer arr[]) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     } 
//     public static void main (String args []) {
//         Integer arr[] = {4, 5, 1, 3, 2};

//         Arrays.sort(arr, Collections.reverseOrder());

//         // for range o index

//         //Arrays.sort(arr, 0, 3, Collections.reverseOrder());
//         printArr(arr);
//     }
    
// }


