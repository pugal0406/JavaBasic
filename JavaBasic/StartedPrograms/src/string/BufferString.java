package string;

public class BufferString {
String name;
String address;
int age;
	BufferString(int age, String name, String address){
		this.name=name;
		this.address=address;
		this.age=age;
	}
	  @Override
	  public String toString() {
	    return name+" "+address+" "+age;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("Welcome to geeksforgeeks");

		BufferString s1=new BufferString(101,"Raj","lucknow");  
		BufferString s2=new BufferString(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1.toString());  
		   System.out.println(s2.toString()); 
		
		System.out.println(Str.substring(7));
	}

}
