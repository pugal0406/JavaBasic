package methodoverloading;

public class Tom extends Jerry{

	public void main(int i) {
		int b=10;
		System.out.println("as"+i);
	}
	public void main(int i,int l) {
		int b=10;
		System.out.println("as11111=="+i);
	}
	 void m1() {
		 System.out.println("child");
	 }
	
	public static void main(String []args) {
		Jerry jr= new Tom();
		jr.m1();
		
	}
}
