package listpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList(); // allow the duplicate and Null value
		al.add("s1");
		al.add("s1");
		al.add(null);
		al.add(null);
		System.out.println("ArrayList====>"+al);
		
		LinkedList ll=new LinkedList(); // allow the duplicate and Null value
		ll.add("s1");
	    ll.add("s1");
		ll.add(null);
		ll.add(null);
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("LinkedList===>"+ll);
		ll.forEach(l ->{System.out.println("ll====>"+l);});
		
		HashMap map=new HashMap();
		map.put("key1","val1");
		map.put("key2","val2");
		map.put("key3","val3");
		Set st=map.entrySet();
		Iterator it=st.iterator();
		while(it.hasNext()) {
			
			Map.Entry m=(Entry) it.next();
			System.out.println("key====>"+m.getKey()+ "value=====>"+m.getValue());
		}
		
		map.forEach((kk,vv) ->{System.out.println("key====>"+kk+ "value=======>"+vv);});
		
	}

}
