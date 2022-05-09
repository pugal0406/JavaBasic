package methodoverloading;

public class OverridingMethodA   
{   
	final int j=100;
	int s=30;
//static method  
public static void sum(int a, int b)   
{  
System.out.println("static method is cannot be ovverride: ");
}   
public final void sum()   
{  
System.out.println("final method is cannot be ovverride: ");
} 
//non-static method   
public void sum(int a)   
{   
	this.s=a;
int c=s;  
System.out.println("The sum is: "+c);   
}

protected void name() {
	System.out.println("parent protected");
}

public void add(int a)   
{   
int c=a;  
System.out.println("The sum is: "+c);   
}
//main method  
  
}  