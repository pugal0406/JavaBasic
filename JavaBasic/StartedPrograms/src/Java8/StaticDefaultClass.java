package Java8;

public class StaticDefaultClass implements DefaultStaticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultStaticInterface s=new StaticDefaultClass();
		s.add();
		s.sum();
		DefaultStaticInterface.temp();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("class");
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("class 1");
	}

}
