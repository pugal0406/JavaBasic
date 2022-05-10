package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterConcept{

	// Driver code
	public static void main(String[] args)
	{
		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "foR",
										"GeEksQuiz", "GeeksforGeeks");

		stream.filter(str -> str.endsWith("s")).collect(Collectors.toList())
			.forEach(System.out::println);
		
	    List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
	    Predicate<String> nameStartsWithS = str -> str.startsWith("S");
	    names.stream().filter(nameStartsWithS).forEach(System.out::println);
	    //names.stream().sorted((Collections.reverseOrder()).c;
	    
	    
	 
	    	
	    		String words=null;
	    		Optional<String> checkNull =
	    					Optional.ofNullable(words);
	    		if (checkNull.isPresent()) {
	    			String word = words.toLowerCase();
	    			System.out.print(word);
	    		} else
	    			System.out.println("word is null");
	    	}
	    
}

