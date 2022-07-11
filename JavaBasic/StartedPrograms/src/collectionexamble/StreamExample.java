package collectionexamble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList alst=new ArrayList();
		alst.add("S");
		alst.add("SAD");
		alst.add("DAS");
		alst.add("SAD");
		alst.add("DAS");
		alst.remove(1);
		alst.add(1, "DOG");
		alst.forEach(ss ->{System.out.println("remove element------->"+ss);});
		//https://java2blog.com/java-8-stream
		Stream strlist=Stream.of("a","b","c") ;
		strlist.map(s -> ((String) s).toLowerCase()).
		forEach(System.out::println);
		
		//generate method
		
		Stream<Integer> intStream=Stream.generate(() -> 2).limit(5);
		System.out.println("generate========method");
		intStream.forEach(System.out::println);
		
		//iterate method
		Stream<Integer> intStreams = Stream.iterate(100 , n -> n+1).limit(5);
		System.out.println("iterate========method");
		intStreams.forEach(System.out::println);
		
		
		List listOutput =  Arrays.asList(alst.toString());
		System.out.println("list using starting letters: "+listOutput.toString());
		String ss=listOutput.toString();
		System.out.println(ss.length());
		System.out.println("list using starting letters: "+listOutput.toString().substring(2,23));
		Scanner sc=new Scanner(System.in);
		String sa=sc.nextLine();
		String sss=listOutput.toString().replaceAll(sa, "");
		System.out.println(sss.toString());
		Stream<String> stream = listOutput.stream().filter(name -> ((String) name).startsWith("J"));

		System.out.println("list using starting letters: "+ stream.collect(Collectors.toList()));    

		
		Stream<String> nameStream = Stream.of("mohan","john","jaibhav","amit");
//		System.out.println("list using starting letters: "+nameStream);
		Stream<String> nameStartJ = nameStream.map(String::toUpperCase).filter(s -> s.startsWith("J"));
		 
		
		System.out.println("Count: "+ nameStartJ.collect(Collectors.toList()));    
		
		
		
	}

}
