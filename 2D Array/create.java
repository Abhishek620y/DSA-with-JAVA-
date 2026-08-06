//package 2D Array;
import java.util.*;

public class create {

    // function to search any element in matrix 
    public static boolean search(int matrix [][] , int key) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("keys are found at cell (" + i + ","+ j + ")" );
                    return true;
                }
            }
        }
        System.out.println("keys are not found");
        return false;
    }
    public static void main (String args []) {
        int matrix [][] = new int [3][3];
        
        int n = matrix.length, m= matrix[0].length;
        Scanner sc = new Scanner (System.in);
        
        // for input element in matrix 
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // print the input element of matrix
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       
        // call the search function 
        search(matrix, 6);
    } 
}
