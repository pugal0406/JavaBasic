package methodoverloading;

public class OverridingMethodB extends OverridingMethodA{
	
	public static void sum(int a, int b)   
	{   
	  
	System.out.println("static chield method");
	 
	}

	/*
	  public final void sum() {
	 System.out.println("static method is cannot be ovverride: "); }
	 */ 
	protected void name() {
		System.out.println("child protected");
	}

	public void sum(int a)   
	{   
	int c=a;  
	System.out.println("chield: "+c);   
	}
	
	public void add(int a)   
	{   
	int c=a;  
	System.out.println("child "+c);   
	}

	

}
