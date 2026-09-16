package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortByKey {
    public static void sortByKey (HashMap<String, Integer> map) {

        // create list for the entries 
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // sort the entries by key 
        list.sort(Map.Entry.comparingByKey());

        // print the sort entries
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("david", 22);
        map.put("charlie", 25);

        sortByKey(map);
    }
}
