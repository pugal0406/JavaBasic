package string;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="vijay";
s.concat("pugal");
System.out.println("concat method"+s);
System.out.println("concat method"+s.concat("pugal"));
StringBuffer ss=new StringBuffer("pugal");
ss.append("vijay");
System.out.println("concat method"+ss);

String s1="p";
if(s.contains(s1)) {
System.out.println(s.contains(s1));
}else {
	System.out.println("false");
}

String s2="pugal vijay";
String[] s3=s2.split(" ");
for(int i=0;i<s3.length;i++) {
	System.out.println(s3[i]);
}
	}

}
