package string;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10;
		Integer b=10;
		if(a==b) {
			System.out.println("called");
		}
		String str1="welcome1";
		String str2="welcome1";
		String str3=new String ("welocme1");
		String str4=new String ("welocme1");
		if(str1==str2) {
			System.out.println(str1==str2);
		}
		else {
			System.out.println("1121212");
		}
		 if(str1.equals(str2)) {
			System.out.println("2 "+str1.equals(str2));
		}
		 if(str1.equalsIgnoreCase(str2)) {
			System.out.println("3 "+str1.equalsIgnoreCase(str2));
		}
			 if(str3.equals(str4)) {
				System.out.println("new 3 "+str3.equals(str4));
			}
			 if(str3.equalsIgnoreCase(str4)) {
				System.out.println("new 4 "+str3.equalsIgnoreCase(str4));
			}
			 if(str3==str4) {
					System.out.println(str3==str4);
				}else {
					System.out.println("not allowed to == in new oprater");
				}
		 
	}

}
