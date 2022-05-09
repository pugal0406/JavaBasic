package abstraction;

public class AbstractName extends Abc implements C  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractName ab=new AbstractName();
		Abc m=new AbstractName();
		m.load();
		ab.odd();
		ab.show();
		
}
	C c=new AbstractName();
	int v=c.a;

	@Override
	public void odd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sum() {
		// TODO Auto-generated method stub
		
	}

}
