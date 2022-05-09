package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class HelloWorld implements FuncInter1,FuncInter2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld b=new HelloWorld();
		FuncInter2 f=new HelloWorld();
		//b.a;
System.out.println("welcome java");
int a[]=new int[10];
a[0]=1;
a[1]=2;
System.out.println(a[1]);
	}

	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

}
