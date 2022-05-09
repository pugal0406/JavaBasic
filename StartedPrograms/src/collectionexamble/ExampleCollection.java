package collectionexamble;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ExampleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="ArrayList";
String l="LinkedList";
String hs="hashset";
String ls="Linkedset";
String ts="treeset";
CollectionTemp1 tr= new CollectionTemp1();
tr.setAddress("chennai");
tr.setAge("24");
tr.setName("pugal");
ArrayList<CollectionTemp1> tl=new ArrayList<CollectionTemp1>();


// apply the condition:

if(!a.contains("ArrayList")) {
	
	// LinkedList allow the duplicate:

		ArrayList<String> str=new ArrayList();
		
		str.add("pugal");
		str.add("vijay");
		str.add("pugal");
		str.add("vijay");
		
		str.forEach(n->{System.out.println("ArrayList======>"+n);});
}else if(!l.contains(l)){
	
	// LinkedList allow the duplicate:
	
		LinkedList<Integer> str1=new LinkedList();
		str1.add(2);
		str1.add(1);
		str1.add(2);
		str1.add(1);
		
		str1.forEach(n1->{System.out.println("LinkedList======>"+n1);});
}
else if(hs.contains(hs) && ls.contains(ls)) {

	// HashSet,LinkedHashSet,TreeSet don't allow the duplicate:
	// HashSet,LinkedHashSet allowed null value,but TreeSet don't allow the null value:
	
Set<String> set=new HashSet();
Set<Integer> liset=new LinkedHashSet();
Set<Integer> lset=new TreeSet();


 
set.add("pugal");
set.add("vijay");
set.add("pugal");
set.add("vijay");
set.add(null);

lset.add(3);
lset.add(1);
lset.add(3);
lset.add(1);

//lset.add(null);

set.forEach(shs->{System.out.println("hashset======>"+shs);});
lset.forEach(lhs->{System.out.println("LinkedHashSet======>"+lhs);});
}

Map<String,Integer> mhm=new HashMap();
Map<Integer,String> lhm=new LinkedHashMap();

//allowed one key is null, but allowed multiple value is null
// don't allowed duplicate value
//Treemap don't allowed the null key, but allowed multiple value is null

mhm.put(null, null);
mhm.put(null, null);
mhm.put("allowed", null);
mhm.put("age", 30);
mhm.put("area", 30);
mhm.put("age", 30);
mhm.put("area", 30);
Set set=mhm.entrySet();
Iterator itr=set.iterator();


while(itr.hasNext()) {
	Map.Entry m=(Entry) itr.next();
	System.out.println("While loop=======>"+m.getKey()+ " "+m.getValue());
}

for(Map.Entry m:mhm.entrySet())
{
	System.out.println("For loop=======>"+m.getKey()+ " "+m.getValue());
}
mhm.forEach((h1,m) ->{System.out.println("Lamda=======> "+h1+ " "+m);});


//Stack work on Last in First out (LIFO) manner.
//Stack allow to store duplicate values.
//Stack class is Synchronized.
//Initial 10 memory location is create whenever object of stack is created and it is re-sizable.
//Stack is one of the sub-class of Vector.

		Stack s=new Stack();
		s.push("12");
		s.push("1");
		s.push("11");
		s.push("12");
		s.push(null);
		s.forEach(lhs->{System.out.println("Stack======>"+lhs);});
		
		
		
		
		Vector v=new Vector();
		v.addElement("12");
		v.addElement("1");
		v.addElement("11");
		v.addElement("12");
		v.addElement(null);
		
		Enumeration e=v.elements();  
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		v.forEach(lhs->{System.out.println("Vector======>"+lhs);});
		
	}

}
