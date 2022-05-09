package DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) throws ParseException { 
		String input = "2017-01-18 20:10:00"; 
		// before Java 8 
		SimpleDateFormat oldFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		Date date = oldFormat.parse(input); 
		SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
		String output = newFormat.format(date); 
		System.out.println("Date in old format: " + input);
		System.out.println("Date in new format: " + output);
		// Using Java 8 new Date and Time API 
		DateTimeFormatter oldPattern = DateTimeFormatter .ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime datetime = LocalDateTime.parse(input, oldPattern); 
		output = datetime.format(newPattern); 
		System.out.println("Date in old format (java 8) : " + input);
		System.out.println("Date in new format (java 8) : " + output); 
		
		
		 DateTimeFormatter OLD_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 DateTimeFormatter NEW_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		String oldString = "26-07-2017";
		LocalDate date1 = LocalDate.parse(oldString, OLD_FORMATTER);
		String newString = date1.format(NEW_FORMATTER);
		System.out.println("newString====="+date1);
		}
	
	
	
	
	}

	

