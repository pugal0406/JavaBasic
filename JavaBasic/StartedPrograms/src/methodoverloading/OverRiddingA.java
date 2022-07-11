package methodoverloading;

public class OverRiddingA {

	static void temp() {
		System.out.println("parent calling");
	}
	void temp(int a) {
		System.out.println("temp calling");
	}
}
