package string;

public class RemoveDuplicate {

	public static void main(String []args) {
	String str="strrts";
	System.out.println(str.toUpperCase());
	/*
	  StringBuilder bf=new StringBuilder();
	  str.chars().distinct().forEach(strs->bf.append((char)strs));
	  System.out.println(bf);
	 */
	/* StringBuilder bf1=new StringBuilder();
	 for(int i=0;i<str.length();i++) {
		 char ch=str.charAt(i);
		int idx= str.indexOf(ch, i+1);
		if(idx==-1) {
			bf1.append(ch);
		}
	 }
	 System.out.println(bf1);
	 */
	char[] cc=str.toCharArray(); // check with all index value
	 StringBuilder bf2=new StringBuilder();
	
	 for(int i=0;i<cc.length;i++) {
		 boolean rep =false;
		 for(int j=i+1;j<cc.length;j++) {
			 if(cc[i]==cc[j]) {
				 rep=true;
				 break;
			 }
		 }
			 if(!rep) {
				 bf2.append(cc[i]);
				
			 }
		 }
	 System.out.println(bf2);
	 }
	 

}
