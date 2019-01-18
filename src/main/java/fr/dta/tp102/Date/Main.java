package fr.dta.tp102.Date;


import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;


public class Main {
	
	public static void main(String[] args) {
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		Date date = new Date();
		System.out.println("D�but du programme : "+fullDateFormat.format(date));
		System.out.println("\n-------------------------------\n");
		
		
		@SuppressWarnings("deprecation")
		Date d = new Date(95,1,1);
		System.out.println(d);
		DayOfWeek dow = DayOfWeek.MONDAY;
		Locale loc = Locale.getDefault();
		System.out.println(dow.getDisplayName(TextStyle.FULL, loc));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, loc));
		System.out.println(dow.getDisplayName(TextStyle.NARROW, loc));
		
		
		
		
		System.out.println("\n-------------------------------\n");
	    LocalDateTime date3 = LocalDateTime.of(2019, Month.JANUARY, 25, 21, 0);
	    System.out.println("Date de noel : " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(date3));

//	     Optional<String> empty = Optional.empty();
//	     String test = "zefkzefkfeakfaekazfe";
//	     assertFalse(empty.isPresent());
//	     Optional.of(test);
	    
	    test t = new test();
	    t.test();
	    System.out.println(0.0/0.0);
	    int x2 = 1_000_2_3_5;			// ne fait rien
	    System.out.println(x2);
	    StringBuilder s1 = new StringBuilder();
	    s1.append("testNumero");
	    s1.setCharAt(2, 'C');
	    s1.setLength(3);
	    System.out.println(s1);
	    int p = 010;  			// >Base 8
	    System.out.println(p);
	    System.out.println(0b101); // base 2

	}


}
