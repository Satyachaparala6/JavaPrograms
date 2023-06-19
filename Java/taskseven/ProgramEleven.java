package taskseven;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProgramEleven {

	public static void main(String[] args) {
	
	HashMap<String, Integer> hashmap= new HashMap<String, Integer>();
    hashmap.put("five", 5);
    hashmap.put("seven", 7);
    hashmap.put("three", 3);
    hashmap.put("nine", 9);
    hashmap.put("zero", 0);
    hashmap.put("eight", 8);

    Map<String, Integer> map = sortByValue(hashmap);
    for (Map.Entry<String, Integer> entry :map.entrySet()) {
        System.out.println("Key : " + entry.getKey()
                           + ", Value : "
                           + entry.getValue());}
	}
	
	public static HashMap<String, Integer>sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(
                hm.entrySet());
 
        Collections.sort(list,
            new Comparator<Map.Entry<String, Integer> >() {
                public int compare(
                    Map.Entry<String, Integer> object1,
                    Map.Entry<String, Integer> object2)
                {
                    return (object1.getValue())
                        .compareTo(object2.getValue());
                }
            });
        HashMap<String, Integer> result
            = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> me : list) {
            result.put(me.getKey(), me.getValue());
        }
        return result;
    }
}
