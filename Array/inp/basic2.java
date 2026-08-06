// array is pass by reference which means if we change thr array in any function, the chnge is 
// reflect in main function 
// But this is not applicable for any variable 


import javax.sql.rowset.spi.SyncResolver;

public class basic2 {
    public static void update (int marks[], int nonchange) {
        nonchange=10;
        for (int i =0; i<marks.length; i++) {
            marks[i]= marks[i] +1;
        }

    }
    public static void main (String args []) {
        int marks [] = {96,98,99};
        int nonchange=5;

        update(marks, nonchange);
        System.out.println(nonchange);

        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}
