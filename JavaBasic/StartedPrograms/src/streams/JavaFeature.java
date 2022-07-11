package streams;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaFeature implements Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaFeature n=new JavaFeature();
		n.t1();
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
			
		//Using Stream and Lambda expression
		long count = names.stream().filter(str->str.length()<6).count();
		System.out.println("There are "+count+" strings with length less than 6");
		
		String otp= new DecimalFormat("0000").format(new Random().nextInt(9999));
		System.out.println(otp);
	}

	
	
	
	@Override
	public void t() {
		// TODO Auto-generated method stub
		
	}

}
