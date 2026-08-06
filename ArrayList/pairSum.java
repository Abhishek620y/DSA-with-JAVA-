// This logic is only available for Sorted arraylist 

// Problem -- find the sum of one pair which is equal to target

// Brute force approach 
/*
import java.util.ArrayList;

public class pairSum {
    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        for (int i=0; i<list.size(); i++) {
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //arraylist = {1, 2, 3, 4, 5, 6}
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5; 
        System.out.println(pairsum1(list, target));   
    } 
}

// Time complexity = O(n^2)
*/

// -----------------------------------------------------------------

/*
// Two pointer Approach
import java.util.ArrayList;

public class pairSum {
    public static boolean pairsum1 (ArrayList<Integer> list, int target) {
        int lp = 0; 
        int rp = list.size()-1;

        while (list.get(lp) < list.get(rp) ) {
           
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if ((list.get(lp) + list.get(rp)) < target) {
                lp ++;
            } else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //arraylist = {1, 2, 3, 4, 5, 6}
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 50; 
        System.out.println(pairsum1(list, target));
        
    }
}

// Time complexity = O(n) which is linear time complexity 

*/

// ----------------------------------------------------------------------------------------


// Problem -- pair sum 2 
// this problem we find the pair sum equal to target in Sorted Rotated array 

// Two Pointer approach 
import java.util.ArrayList;

public class pairSum {
    public static boolean pairasum2 (ArrayList<Integer> list, int target) {
        // Find breaking point or pivot point
        int breakPoint = -1;
        int n = list.size();
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) > list.get(i+1) ) {
                breakPoint = i;
                break;
            }
        }

        int leftpointer = breakPoint+1;  // smallest element
        int rightpointer = breakPoint;  // Largest element

        while (leftpointer != rightpointer) {
            // case 1
             if (list.get(leftpointer) + list.get(rightpointer) == target) {
                return true;
             } 
             // Case 2
             else if (list.get(leftpointer) + list.get(rightpointer) < target) {
                leftpointer = (leftpointer +1) % n;  // Arithmatic modulo
             }
             // case 3
             else {
                rightpointer = (n + rightpointer -1) % n;   
             }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //arraylist = [1, 2, 3, 4, 5, 6]  Sorted & Rotated 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 50;
        System.out.println(pairasum2(list, target)); 
        
    }
}

// Time Comlexity = O(n)
//  Arithmatic modulo --- this is used to increse pointer in rotated form 