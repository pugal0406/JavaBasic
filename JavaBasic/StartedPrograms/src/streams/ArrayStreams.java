package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArrayStreams {

public static void main(String[] args) {
ArrayList<Integer> numbersList=new ArrayList<>();
ArrayList<String> sl=new ArrayList<>();
 numbersList.add(1);
 numbersList.add(3);
 numbersList.add(2);
 numbersList.add(3);
 numbersList.add(1);
 
 
 sl.add("rom");
 sl.add("cell");
 sl.add("recharge");
 sl.add("call");
 sl.add("continue");

    List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
    sl.stream().filter(s -> s.startsWith("c")).forEach(System.out::println);
//    System.out.println("ccccccccc"+nameStartJ.collect(Collectors.toList()));
    
    boolean str=sl.stream().anyMatch(s -> s.startsWith("c"));
    boolean str1=sl.stream().allMatch(s -> s.startsWith("c"));

    boolean str2=sl.stream().noneMatch(s -> s.startsWith("c"));

    System.out.println("anyMatch--->"+str+" allMatch--->"+str1+" noneMatch---->"+str2);
    
    numbersList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    
    System.out.println(listWithoutDuplicates);
    
  

}


}