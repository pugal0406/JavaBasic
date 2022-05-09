package interviewQuestions;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Fact {


	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int temp=1;
		for(int i=1;i<=a;i++)
		{
			temp=temp*i;
		}
		System.out.println(temp);

	
		
	}*/
		Scanner sc=new Scanner(System.in);
		String string = sc.next();

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}

}
