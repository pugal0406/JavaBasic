package collectionexamble;

public class ExceptionProgram {
	 static String inputString = "123.33";   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ExceptionProgram e=new ExceptionProgram();
	e.add();
	int a=Integer.parseInt(inputString);
}catch(NumberFormatException e) {
	System.out.println("NumberFormatException called");	
}
	}
	public void add() throws NullPointerException {
		try {
		String n=null;
		if(n.equals(null)) {
			System.out.println("NullPointerException called");
		}
		}
		catch(Exception n) {
			System.out.println("Exception");
		}
		
	}

}
