package methodoverloading;

public class CheckedEx {
//	 static String inputString = "123.33";   
      
	    public static void main(String[] args) {  
	       
	        try {
	        	String s=null;
	        	if(s.equals(null)) {
	        		System.out.println("null");
	        	}
	        }catch(NullPointerException ex){  
	            System.err.println("Invalid string in argumment");  
	            //request for well-formatted string  
	        } 
	            }  

}
