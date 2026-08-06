//package RecursionJava;
//package Recursion;

/* 
// Problem 1 -- print the number in decreasing order from n to 1

public class problems {
    public static void printNUmDec (int n) {
        
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNUmDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNUmDec(n);
    }
}
*/

// ------------------------------------------------------------------------

/* 
// Problem 2 -- print the number in increasing order from 1 to n

public class problems {
    public static void printNUmInc (int n) {
        if (n == 1 ) {
            System.out.print(n + " ");
            return;
        }
        printNUmInc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printNUmInc(n);  
    }
} 
*/

// --------------------------------------------------------------------------
/* 
//  Problem 3 -- print the factorial of n 

public class problems {
    public static int factN (int n) {
        if (n == 0) {
            //System.out.println("1");
            return 1;
        }
        int fact = n * factN(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factN(n));
    }
}

// Time and space complexicity of this code is O(n)
*/

// -------------------------------------------------
/*
   Problem 4 - print the sum on n natural number 

public class problems {
    public static int sumOfNaturalNo (int n) {
        if (n == 1) {
            return 1;

        }
        //int sum = (n*(n+1))/2;
        //System.out.println(sum);

        int sum = n + sumOfNaturalNo(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(sumOfNaturalNo(n));
    }
}

// Time and space complexicity of this code is O(n)
*/

// -------------------------------------------------------------------
/* 
     Problem 5 -- find the Nth fibonacci number 

public class problems {
    public static int fibnacci(int n) {
        if (n ==0 || n==1 ) {
            return n;
        }
        
        int fib = fibnacci(n-1) + fibnacci(n-2);
        return fib;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibnacci(n));

    }
}

// Time complexity is O(2^n)
// space complexity is O(n)
*/

// ---------------------------------------------------------------------

/*
    Problem 6 -- check if the given array is sorted 

public class problems {
    public static boolean isSorted(int arr [], int i) {
        if (i == arr.length -1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 6};
        System.out.println(isSorted(arr, 0));
        
    }
}

// Time complexity is O(n)
// space complexity is O(n)
*/

// ---------------------------------------------------------------

/* 
  Problem 7 -- Write a function to print the index of first occurence of element in array 

public class problems {
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length-1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {5, 6, 8, 7, 9, 3, 5, 7};
        //int key = 7;
        System.out.println(firstOccurence(arr, 7, 0)); 
    }
}

Time and Spacecomplexity is O(n)
*/

// -----------------------------------------------------------------------
/* 
Priblem 8 --  Write a function to print the index of last occurence of element in array

public class problems {
    public static int lastOcuence (int arr[], int key,int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOcuence(arr, key, i+1);

        if (isFound == -1 && arr[i] == key ) {
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        //int arr [] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int arr [] = {5, 5, 5, 5, 5};
        System.out.println(lastOcuence(arr, 5, 0));
    }
}

// Time and Spacecomplexity is O(n)
*/

// -------------------------------------------------------------------------
/* 
Problem 9 -- print x to the power n 

public class problems {
    public static int powerOfX(int x, int n) {
        if (n == 0 ){
            return 1;
        }
        int power = x * powerOfX(x, n-1);
        return power; 

        // return x * powerOfn(x, n-1);
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(powerOfX(x, 4));
    }
}

// Time And space complexity is O(n)
*/

// -------------------------------------------------------------------


/* 
// Problem 9 -- Optimized method to calculate the power of x to the power n 

public class problems {
    public static int optimizedPower (int x, int n ) {
        if (n ==0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfpowersqr = halfpower * halfpower;

        if (n%2 != 0) {
            halfpowersqr = x * halfpowersqr;
        }
        return halfpowersqr;
    }
    public static void main(String[] args) {

        System.out.println(optimizedPower(2, 5)); 
    }
}

// Time complexity is O(logn)
*/

// --------------------------------------------------------
/* 

// Problem 10 -- tilling problem 

public class problems {
    public static int tillingProblem(int n) {
        if (n ==0 || n ==1) {
            return 1;
        }

        // vertical choice 
        // int fnm1 = tillingProblem(n-1);

        // // horizontal choice 
        // int fnm2 = tillingProblem(n-2);
        // int totalWays = fnm1 + fnm2;
        // return totalWays;

        //      OR

        return tillingProblem(n-1) + tillingProblem(n-2);
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tillingProblem(n));
        
    }
}
*/

// ---------------------------------------------------------
/* 
// Problem 11 -- Removes duplicates from string 
public class problems {
    public static void removeDuplicate(String str, int indx, StringBuilder newStr, boolean map[] ) {
        if (indx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, indx + 1, newStr, map);   
        } else {
            map[currChar-'a'] = true;
            removeDuplicate(str, indx +1, newStr.append(currChar), map);

        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
}
*/

// ------------------------------------------------------------------------

/* 
// Problem 12 -- Friends pairing choice problem 

public class problems {
    public static int friendsPairing (int n ) {
        if (n ==1 || n ==2) {
            //System.out.println(n);
            return n;
        }

        // // single
        // int fnm1 = friendsPairing(n-1);

        // // pair 
        // int fnm2 = (n-1) * friendsPairing(n-2);

        // int totalWays = fnm1 + fnm2;
        // return totalWays;

        return friendsPairing(n-1) + ((n-1) * friendsPairing(n-2));
    }  
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        
    }
}
*/

// ----------------------------------------------------------------------
/* 

// Problem 13 -- Print all Binary String  of size n without consecutive ones

public class problems {
    public static void printBinaryStr (int n , int lastpalce, String str ) {
        if (n ==0) {
            System.out.println(str);
            return;
        }
        
        printBinaryStr(n-1, 0, str+"0");
        if (lastpalce == 0) {
            printBinaryStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryStr(3, 0, "");
    }
}

// Time and Space complexity is O(n)

*/

// --------------------------------------------


// Problem 14 -- Print all Binary String  of size n without consecutive zeroes
public class problems {
    public static void printBinaryStr (int n , int lastpalce, String str ) {
        if (n ==0) {
            System.out.println(str);
            return;
        }
        
        printBinaryStr(n-1, 1, str+"1");
        if (lastpalce == 1) {
            printBinaryStr(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        printBinaryStr(3, 1, "");
        
    }
}
