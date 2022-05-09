package listpackage;

public class ExceptionCall {

	public int add() {
		int a=0;
		int b=12;
		
		int c=b/a;
		return c;
	}
	public static void main(String []args) throws CallException {
		ExceptionCall call=new ExceptionCall();
		try {
			String s=null;
			try {
			if(null=="null") {
				System.out.println("nullpointer");
			}
			}catch(NullPointerException n) {
				System.out.println("nullpointer");
//				throw new CallException();
			}
		int d=call.add();
		System.out.println(d);
		}catch(ArithmeticException e) {
			throw new CallException();
		}finally {
			System.out.println("finally called");
		}
	}
}



