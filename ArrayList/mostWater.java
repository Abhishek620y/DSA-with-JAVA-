// Brute force approach for Most water in container 
/*
import java.util.ArrayList;

public class mostWater {
    public static  int mostwaterCon (ArrayList<Integer> height) {
        int maxWater = 0; 

        for (int i=0; i<height.size(); i++){
            for (int j = i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j-i; 
                int currwater = ht * wt;
                maxWater = Math.max(maxWater, currwater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        //arraylist = {1, 8, 6, 2, 5, 4, 8, 3, 7}
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(mostwaterCon(height));
    }   
}

// Time complexity = O(n^2)

*/

// Two Pointer Approach --------------------------------------------------------------
import java.util.ArrayList;

public class mostWater {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater =0; 
        int leftpointer = 0;
        int rightpointer = height.size()-1;

        while (leftpointer < rightpointer) {
            int ht = Math.min(height.get(leftpointer), height.get(rightpointer));
            int wt = rightpointer-leftpointer;

            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);

            if (height.get(leftpointer) < height.get(rightpointer)) {
                leftpointer++;
            } else {
                rightpointer--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        //arraylist = {1, 8, 6, 2, 5, 4, 8, 3, 7}
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));  
    }
}

// Time Complexity = O(n)