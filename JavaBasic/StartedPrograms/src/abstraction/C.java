package abstraction;

public interface C  {

	public static final int a=10;
	abstract void odd();  //final,protected,private,static don't allow the access modifier
	 static void sim() {
		 System.out.println("interface");
	 }
	 
}
