package streams;

public  class Abc {
	static {
		System.out.println("static block calling");
	}

	static void add() {
		System.out.println("0000");
	}
	static void ad() {
		System.out.println("111");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int qa=10;
//		qa=1; // we cannot change
		Abc a=new Abc();
		System.out.println(qa);
		  
		  add();
		
		ad(); // static method only with out create an object
	}

}
