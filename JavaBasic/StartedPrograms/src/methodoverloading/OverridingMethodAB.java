package methodoverloading;

public class OverridingMethodAB extends OverridingMethodB {

	public void div() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingMethodA ab=new OverridingMethodAB(); // current class obj
OverridingMethodA a=new OverridingMethodB();   // parent class obj called as upcasting
//OverridingMethodB b=new OverridingMethodB();   // child class obj
ab.sum();
StringBuffer sb=new StringBuffer("viay");
sb.append(" A");
System.out.println("StringBuffer is mutable"+sb);
System.out.println("1");
ab.sum(0, 0);
System.out.println("2");
ab.add(0);
System.out.println("3");
ab.sum(0);
System.out.println("4");

// a.j=10;  //because the final var value we can't change.
a.sum(12);
a.add(23);
a.sum(21, 01);
//b.sum(0,0);
a.sum();
	}

}
