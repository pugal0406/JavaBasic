package abstraction;

public abstract class A{
	int a;
	 abstract void sum(); // declaration method
	 public abstract void odd(); // public,protected,abstract key words only allowed
	
	 
	 void load(){ // Definition method
		System.out.println("parent abstract method");
		
	}
	A(){
		System.out.println("Constractor");
	}
	static
	{
		System.out.println("static method");
	}
}
