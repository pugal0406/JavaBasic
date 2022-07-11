package interviewQuestions;
import java.util.Scanner;

public class PerfectNumber implements Cloneable {
	
	String sd="pugal";
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		PerfectNumber pr=new PerfectNumber();
		PerfectNumber prs=(PerfectNumber) pr.clone();
		System.out.println(prs.sd);
		System.out.println(prs.sd);
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		n=sc.nextInt();
		for(int i=1;i<n;i++){
			if(n%i==0){
			sum=sum+i;
			}
		}
		if(n==sum){
		System.out.println(n+"perfect");
	}else
	{
		System.out.println(n+"not perfect");	
	}
	}
}
