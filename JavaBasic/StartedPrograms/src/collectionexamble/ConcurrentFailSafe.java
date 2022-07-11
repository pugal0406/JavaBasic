package collectionexamble;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentFailSafe {
public static void main(String []args) {
	 ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
     //Adding elements to map
     map.put("Dell", 1);
     map.put("IBM", 2);
     //Getting an Iterator from map
     Iterator<String> it = map.keySet().iterator();
     while (it.hasNext()){
     String key = (String) it.next();
        System.out.println(key+" : "+map.get(key));
        map.put("Google", 3);
        System.out.println(key+" ==== "+map.get(key));
     }
     for(Map.Entry m:map.entrySet()) {
    	 System.out.println(m.getKey()+" "+m.getValue());
     }
}
}
