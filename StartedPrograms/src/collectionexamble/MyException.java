package collectionexamble;

public class MyException extends Exception {
	MyException(){
		System.out.println("Concurrent modificaion Exception");
	}
}
