package Java8;

public interface DefaultStaticInterface {

	void sum();
	
	default void  add(){
		System.out.println("default method");
	}
	static void temp() {
		System.out.println("static method");
	}
}
