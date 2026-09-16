package HashMap;
import java.util.*;

public class sortByValue {
    public static void  sortByvalue(HashMap<String, Integer> map) {
        
        // create a list for hashmap entries 
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // sort the list by value 
        list.sort(Map.Entry.comparingByValue());

        // print sorted entries 
        for (Map.Entry<String, Integer> entry : list ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("charlie", 20);
        map.put("david", 22);

        // function call
        sortByvalue(map);
    }
}
