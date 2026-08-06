// Spiral matrix 
// main calculation is how o print the first top(1st row) , second right side without include first row last element 
// third bottom of matrix without include last row last element and forth left without include last row first element and first row first element 


//package 2D Array;

public class spiralMat {
    public static void SpiralMatrix(int matrix [][]) {
        int strtrow=0;
        int strtcol=0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(strtrow <= endrow && strtcol <= endcol) {

            // top 
            for (int j=strtcol; j<=endcol; j++) {
                System.out.print(matrix[strtrow][j] + " ");
            }

            // right 
            for (int i=strtrow+1; i<=endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // bottom 
            for (int j=endcol-1; j>=strtcol; j--) {
                if (strtrow==endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            // left 
            for (int i=endrow-1; i>=strtrow+1; i--) {
                if (strtcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][strtcol] + " ");
            }
            strtrow++;
            strtcol++;
            endrow--;
            endcol--;
        
        }
    }
    public static void main (String args [] ) {
        int matrix [][] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
        
        SpiralMatrix(matrix);
    }
}
