/* 
// Problem 1, --> print the reverse of list
import java.util.ArrayList;
public class problemInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Reverse the list ----->    TC = O(n)
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
// Time complexity = O(n)
*/

/* 
// Problem 2 -- >  Print Maximum elemnet in arrayList
import java.util.ArrayList;
public class problemInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println(list);

        int max = Integer.MIN_VALUE;
         for (int i=0; i<list.size(); i++) {
        //     if (max < list.get(i)) {
        //         max = list.get(i);
        //     }
        //    OR 
            max = Math.max(max, list.get(i));
         }
         System.out.println("Maximum element is: "+  max);
    }
}

// Time complexity = O(n)
*/


/* 
// Problem --> Swap the elemnt in arraylist at specific two index 
import java.util.ArrayList;
public class problemInList {
    public static void swap (ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(8);
        //System.out.println(list);

        int indx1 = 1, indx2 = 3;
        System.out.println(list);
        swap(list, indx1, indx2);
        System.out.println(list);

    }
}
// Time complexity = O(n)
*/

import java.util.ArrayList;
import java.util.Collections;

//import java.util.*;
public class problemInList {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

        Collections.sort(list);  // peint in assending order
        System.out.println(list);

        // print in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }


}