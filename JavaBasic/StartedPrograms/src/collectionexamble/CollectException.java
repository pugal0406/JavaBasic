package collectionexamble;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CollectException {

	public static void main(String[] args) throws MyException{
		//fail safe example
		
		// https://www.tutorialspoint.com/difference-between-fail-fast-and-fail-safe-in-java
		try {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	    map.put("Dell", 1);
	    map.put("IBM", 2);
	    //Getting an Iterator from map
	    Iterator<String> it = map.keySet().iterator();
	    while (it.hasNext()){
	    String key = (String) it.next();
	       System.out.println(key+" : "+map.get(key));
	       map.put("Google", 3);
	       System.out.println("end");
	    }
		}catch(ConcurrentModificationException e) {
			System.out.println("ConcurrentModificationException");
		}
	    //Fail-Fast Example
		
		ArrayList<String> str=new ArrayList();
		str.add("call");
		str.add("my");
		str.add("mom");
		Iterator itr=str.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		try {
			System.out.println("come inside"+itr.next());
			//going to add,remove,update that time ConcurrentModificationException occuring.
			// ConcurrentModificationException is Runtime Exception
			
		str.add("error");
	}catch(Exception e) {
		throw new MyException();
	}
	}	
	}

}
