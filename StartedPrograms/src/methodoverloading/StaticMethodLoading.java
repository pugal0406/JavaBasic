package methodoverloading;

public class StaticMethodLoading {
	
	static void main() {
		System.out.println("empty parameter calling");
	}
	public static void main(int a) {
		System.out.println("Integer 1 method");
	}

	public static void main(float a) {
		System.out.println("Integer 3 method");
	}
	public static void main(int args,int b) {
		System.out.println("Integer 2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodLoading am= new StaticMethodLoading();
		am.main();
		am.main(12);
		am.main(12.0f);
		am.main(1,2);
	}

}
