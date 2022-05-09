package Inheritance;

public class Bdata extends Adata {

	void add() {
		System.out.println("Bdata");
	}
	void sum() {
		System.out.println("Bdata");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bdata b=new Bdata();
Adata a=new Bdata();
//Bdata bb=(Bdata) new Adata();
a.add();
b.add();
//bb.add();
	}

}
