//package Array;

import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();
        
        // add element in Arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Get operation
        int element = list.get(2);
        //System.out.println(element);
        
        // Remove element
        // list.remove(2);
        // System.out.println(list); 

        // set element at index
        // list.set(2, 10);
        // System.out.println(list);

        // // Contains element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(12));

        // size of ArrayList 
        System.out.println(list.size()); 

        // prit the arraylist
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
