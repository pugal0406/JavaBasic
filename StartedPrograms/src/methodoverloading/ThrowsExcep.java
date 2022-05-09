package methodoverloading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsExcep {
	public void fun() throws NullPointerException,IOException
	{
		try {
			String n=null;
			if(n.equals(null)) {
				System.out.println("NullPointerException called");
			}
			}
			catch(Exception n) {
				System.out.println("Exception");
			}
		System.out.println("Inside fun(). ");
		FileWriter file = new FileWriter("c:\\Data1.txt");
	      file.write("Guru99");
	      file.close();
			}
	public static void main(String args[])
	{
		try
		{
			ThrowsExcep e=new ThrowsExcep();	
			e.fun();
		}
		catch(IOException e)
		{
			System.out.println("caught in main.");
		}
	}
}
