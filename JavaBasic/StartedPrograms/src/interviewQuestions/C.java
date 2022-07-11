package interviewQuestions;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=(Parent)new Child();
		p.showMessage();
		
		Child c = (Child)p;
		
		c.showMessage();
		c.callme2();
		
	}

}
