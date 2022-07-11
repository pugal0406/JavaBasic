package constractor;

public class Constracts extends Constract {
	Constracts(int a,int b){
		System.out.println("parent class calling "+super.a+" "+super.s);
		this.a=a;
		super.dd();
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		Constracts c=new Constracts(5,6);
	//	Constract cv=new Constract(5,10);
		

	}

}
