package methodoverloading;

public class StaticExtendMethodLoading {
int a=10;

 int load(int a) { 
	 System.out.println(this.a=a);
return a;
  } 
  int load(int a,int b) {
 this.a=a;
int c=a+b;
  System.out.println(this.a+"====="+b+"---------"+a);
return c; 
}
  static void ddd() {
	  System.out.println("static method extend and overload");
  }
  
final void dd() {
	final int a=10; //only final keyword is allowed
	System.out.println("final method extend and overload");
}

}




