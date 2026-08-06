//      Print Subarray  

// public class subArrays {
//     public static void printSubarray(int number []) {
//         int totalSub=0;
//         for (int i=0; i<number.length; i++) {
//             int start=i;
//             for (int j=i; j<number.length; j++) {
//                 int end=j;
//                 for (int k=start; k<=end; k++) {
//                     System.out.print(number[k] + " ");
//                 }
//                 totalSub++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total Subarrays are: " + totalSub);
//     }
//     public static void main (String args []) {

//         int number[] = {2, 4, 6, 8, 10};
//         printSubarray(number);    
//     }
// }


// public class subArrays {
//     public static void printSubarray(int number []) {
//         int totalSub=0;
//         for (int i=0; i<number.length; i++) {
            
//             for (int j=i; j<number.length; j++) {

//                 for (int k=i; k<=j; k++) {
//                     System.out.print(number[k] + " ");
//                 }
//                 totalSub++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Toatal Subarrays are: " + totalSub);
//     }
//     public static void main (String args []) {

//         int number[] = {2, 4, 6, 8, 10};
//         printSubarray(number);    
//     }
// }

// -----------------------------

// Sum of each subarray 

//  public class subArrays {
//     public static void printSubarray(int number []) {
//         int totalSub=0;
//         for (int i=0; i<number.length; i++) {
            
//             for (int j=i; j<number.length; j++) {
//                     int sum=0;
//                 for (int k=i; k<=j; k++) {
//                     System.out.print(number[k] + " "); 
//                     sum +=number[k];
//                 }
//                 System.out.println("sum is: " + sum);
//                 totalSub++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Toatal Subarrays are: " + totalSub);
//     }
//     public static void main (String args []) {

//         int number[] = {2, 4, 6, 8, 10};
//         printSubarray(number);    
//     }
// }

// -------------------------------------------------------

// Maximum Aubarray sum (Brute Force approach)

// public class subArrays {
//     public static void maxSubarraySum(int number []) {
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;

//         for (int i=0; i<number.length; i++) {
//             for (int j=i; j<number.length; j++) {
//                 currSum =0;
//                 for (int k=i; k<=j; k++) {
//                     currSum += number[k];
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum sum is: " + maxSum);
//     }
//     public static void main (String args []) {
//         int number [] = {1, -2, 6, -1, 3};
//         maxSubarraySum(number);
//     }
// }

// Time complexity -- O(n^3) 

// ----------------------------------------------------

// Prefix Sum Approach to find the Maximum Subarray Sum

// public class subArrays {
//     public static void subArraySum(int number []) {
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[] = new int [number.length];

//         prefix[0]= number[0];
//         for (int i=1; i<prefix.length; i++) {
//             prefix[i]=prefix[i-1] + number[i];
//         }

//         for (int i=0; i<number.length; i++) {
//             for (int j=i; j<number.length; j++) {
//                 currSum= i==0 ? prefix[j] : prefix[j] - prefix[i-1] ;

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum sum is: " + maxSum);
//     }

//     public static void main (String args []) {
//         int number [] = {1, -2, 6, -1, 3};
//         subArraySum(number);
//     }
// }

// ----------------------------------------------------------

// Kadane's algorithm for Maximum Subarray sum 

// public class subArrays {
//     public static void maxSubarraySum(int number []) {
//         int maxSum=Integer.MIN_VALUE;
//         int currSum=0;

//         for (int i=0; i<number.length; i++) {
//             currSum = currSum + number[i];
//             if (currSum<0) {
//                 currSum=0;
//             }

//             maxSum= Math.max(currSum, maxSum);
//         }
//         System.out.println("MAximum Subarray sum is : " + maxSum);
//     }

//     public static void main (String args []) {
//         int number [] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        // int number[] = {-1, -2, -3, -4};
//         maxSubarraySum(number);
//     }
// }

// -------------------------------------------

// Kadane's algorithm For All negative number in array 

public class subArrays {
    public static void maxSubarraySum(int number []) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for (int i=0; i<number.length; i++) {
            if (number[i]<0) {
              
            }

        }

        for (int i=0; i<number.length; i++) {
            currSum = currSum + number[i];
            // if (currSum<0) {
            //     currSum=0;
            // }

            maxSum= Math.max(currSum, maxSum);
        }
        System.out.println("MAximum Subarray sum is : " + maxSum);
    }

    public static void main (String args []) {
        //int number [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int number[] = {-7, -2, -3, -4, -9};
        maxSubarraySum(number);
    }
}