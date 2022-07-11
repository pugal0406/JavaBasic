package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profile {

	public static void main(String args[]) {
	ArrayList<Student> s=new ArrayList<Student>();
	Student ss=new Student();
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String name=sc.next();
	String schoolname=sc.next();
	for(int i=0;i<5;i++) {
		ss.setId(id);
		ss.setName(null);;
	}
	
	
	List listWithoutDuplicates = s.stream().distinct().collect(Collectors.toList());
	
	System.out.println(listWithoutDuplicates);
}
}