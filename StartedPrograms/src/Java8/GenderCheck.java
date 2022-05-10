package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GenderCheck {

	 public static void main(String[] args)
	    {
	        List<Person> personList = new ArrayList<>();

	        personList.add(new Person("Alice","alice@gmail.com",Gender.FEMALE, 20));
	        personList.add(new Person("Bob","bob@gmail.com", Gender.MALE, 15));
	        personList.add(new Person("Carol","carol@gmail.com",Gender.FEMALE, 23));
	        personList.add(new Person("David","david@gmail.com",    Gender.MALE, 19));
	        personList.add(new Person("Eric","eric@gmail.com", Gender.MALE, 26));
	        Person pp=null;
	        for(Person per:personList) {
	        	pp=new Person();
	        	pp.setName(per.getName());
	        	pp.setEmail(per.getEmail());
	        	pp.setAge(per.getAge());
	        	pp.setGender(per.getGender());
	       
	        }
	        for(int i=0;i<personList.size();i++) {
	        	
	        	System.out.println("Name of List " + (i + 1) + ": "
                        + personList.get(i));
	        }
	        
	        
	        /*
	         * The filter() operation returns a new stream that consists elements
	         * matching a given condition which is typically a boolean test in form
	         * of a Lambda expression.
	         * 
	         * The following code lists only female persons:
	         */
	        personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
	                                                .forEach(System.out::println);
	        
	        
	        System.out.println("\n--------Filterd based on Male and Age<=25--------");
	        
	        /*
	         * The following code shows only male who are under 25:
	         */
	        personList.stream().filter(p -> p.getGender().equals(Gender.MALE) && p.getAge() <= 25)
	                .forEach(System.out::println);
	        
	        Optional<Person> max=personList.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge)));
	        System.out.println("Maxmum Value is showing "+max);
	        
	        Optional<Integer> secondMax= personList.stream().map(d -> d.getAge()).sorted(Comparator.reverseOrder()).skip(1).findFirst();
	        
	        if(personList.stream().filter(p -> p.getGender().equals(Gender.MALE)) != null) {
	        Optional<Person> thirdMax= personList.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).skip(2).findFirst();

	        System.out.println("Second Maxmum Value is showing "+secondMax+" \n"+"Third Maxmum Value is showing "+thirdMax);
	        }
	    }

}
