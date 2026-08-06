//package 2D Array;

// Search in Sorted matrix  
// optimesed code (Stairscase Search)

// Case 1.   (0, m-1)
//          key < cell value --- move left
//          key > cell value --- move bottom 

// Case 2.   (n-1, 0)
//           key < cell value -- move top
//           key > cell value --- move right 


//                  Case 1
// public class serhInSorMatx {
//     public static boolean staircaseSearch(int matrix [][], int key) {
//         int row=0, col=matrix.length-1;

//         while (row < matrix.length && col >= 0) {
//             if (matrix [row][col] == key ) {
//                 System.out.println("key is found at (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;

//             } else {
//                 row++;
//             }
//         }
//         System.out.println("key are not found");
//         return false;
//     }
//     public static void main (String args []) {
//         int matrix [][] = {{10, 20, 30, 40}, 
//                            {15, 25, 35, 45}, 
//                            {27, 29, 37, 48},
//                            {32, 33, 39, 50}};

//         // int matrix[][] = {{1, 2, 3}, 
//         //                   {4, 5, 6},
//         //                   {7, 8, 9}};
        
        
//         staircaseSearch(matrix, 55);
//     }
    
//}



//                          Case 2
public class serhInSorMatx {
    public static boolean staircaseSearch(int matrix [][], int key) {
        int row=matrix[0].length-1, col=0;

        while (col < matrix[0].length && row >= 0) {
            if (matrix [row][col] == key ) {
                System.out.println("key is found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;

            } else {
                col++;
            }
        }
        System.out.println("key are not found");
        return false;
    }
    public static void main (String args []) {
        int matrix [][] = {{10, 20, 30, 40}, 
                           {15, 25, 35, 45}, 
                           {27, 29, 37, 48},
                           {32, 33, 39, 50}};

        // int matrix[][] = {{1, 2, 3}, 
        //                   {4, 5, 6},
        //                   {7, 8, 9}};
        
        
        staircaseSearch(matrix, 55);
    }
}