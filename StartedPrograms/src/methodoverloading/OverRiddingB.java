package methodoverloading;

public class OverRiddingB extends OverRiddingA {
	
	static void temp() {
		System.out.println("child class");
	}
	void temp(int a) {
		System.out.println("child temp calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiddingA a=new OverRiddingA();
		a.temp();
		a.temp(0);
		OverRiddingA b=new OverRiddingB();
		b.temp();
		b.temp(1);
	}

}
