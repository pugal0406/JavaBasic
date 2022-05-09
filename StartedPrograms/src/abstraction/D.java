package abstraction;

public class D implements C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D d=new D();
d.odd();
	}

	@Override
	public void odd() {
		// TODO Auto-generated method stub
		C d=new D();
//		d.a=111;
		System.out.println(d.a);
	}

}
