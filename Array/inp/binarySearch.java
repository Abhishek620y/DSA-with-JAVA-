// Binary Search 

public class binarySearch {
    public static int binarySearch(int number [] , int key) {
        int start=0, end=number.length-1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] <key) {
                start= mid +1; 
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main (String args []) {
        int number [] = {1, 3, 4, 5, 6, 7, 9, 10};
        int key= 10;

        System.out.println(binarySearch(number, key));
    }
}

// Time Complexity-- "O(log n)"