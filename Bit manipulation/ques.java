//package Bit manipulation;

// check if the number is even or odd 

// import java.util.Scanner;
// public class ques {
//     public static void main (String args []) {

//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         //int bitMask =1; 
//         if ((num & 1) == 0) {
//             System.out.println("even number");
//         } else {
//             System.out.println("odd number");
//         }
//     }
// }


// print the number on Ith place of binary number 

// import java.util.Scanner;
// public class ques {
//     public static int getIthBit(int n, int i) {
//         if ((n & (1<<i)) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }
//     public static void main (String args []) {

//         // Scanner sc = new Scanner (System.in);
//         // int num = sc.nextInt();
//         // int i = sc.nextInt();
//         // //int bitMask =1; 
//         // if ((num & (1<<i)) == 0) {
//         //     System.out.println("0");
//         // } else {
//         //     System.out.println("1");
//         // }

//         System.out.print(getIthBit(10, 2));
//     }
// }


// public class ques {
//     public static int setIthBit(int n, int i) {
//         int bitMask= 1<<i;
//         return n | bitMask;
//     }
//     public static void main (String args []) {

        // Scanner sc = new Scanner (System.in);
        // int num = sc.nextInt();
        // int i = sc.nextInt();
        // //int bitMask =1; 
        // if ((num & (1<<i)) == 0) {
        //     System.out.println("0");
        // } else {
        //     System.out.println("1");
        // }

//         System.out.print(setIthBit(10, 2));
//     }
// }


// prin ith clear bit 

//  public class ques {
//     public static int clearIthbit(int n, int i) {
//         int bitmask= ~(1<<i);

//         return n & bitmask;
//     }
//     public static void main (String args []) {
//         System.out.print(clearIthbit(10,1));
//     }
//  }

// update the ith bit 

//  public class ques {
//     public static int setIthBit(int n, int i) {
//         int bitMask= 1<<i;
//         return n | bitMask;
//     }
//     public static int clearIthbit(int n, int i) {
//         int bitmask= ~(1<<i);
//         return n & bitmask;
//     }
//     public static  int updateIthbit (int n, int i, int newBit) {
//         if (newBit==0) {
//             return clearIthbit(n, i);

//         } else {
//             return setIthBit(n, i);
//         }

//     }
//     public static void main (String args []) {
//         System.out.print(updateIthbit(10,2,1));
//     }
//  }

// clear last i bits 
public class ques {
    public static int clearIbit (int n, int i) {
        int bitMask= (~0)<<i;
        return n & bitMask;
    }
    public static void main (String args []) {
        System.out.println(clearIbit(15, 2));
    }

}
