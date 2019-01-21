package fr.dta.tp102.date;


import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
	
	private static final  Logger logger = LoggerFactory.getLogger(Main.class);
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		Date date = new Date();
		logger.info("D�but du programme : "+fullDateFormat.format(date));
		logger.info("\n-------------------------------\n");
		
		
		Date d = new Date(95,1,1);
		logger.info(d.toString());
		DayOfWeek dow = DayOfWeek.MONDAY;
		Locale loc = Locale.getDefault();
		logger.info(dow.getDisplayName(TextStyle.FULL, loc));
		logger.info(dow.getDisplayName(TextStyle.SHORT, loc));
		logger.info(dow.getDisplayName(TextStyle.NARROW, loc));
		
		
		
		
		logger.info("\n-------------------------------\n");
	    LocalDateTime date3 = LocalDateTime.of(2019, Month.JANUARY, 25, 21, 0);
	    logger.info("Date de noel : " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(date3));

//	     Optional<String> empty = Optional.empty();
//	     String test = "zefkzefkfeakfaekazfe";
//	     assertFalse(empty.isPresent());
//	     Optional.of(test);
	    
	    Test t = new Test();
	    t.essai();
	    int x2 = 1_000_2_3_5;			// ne fait rien
	    logger.info(Integer.toString(x2));
	    StringBuilder s1 = new StringBuilder();
	    s1.append("testNumero");
	    s1.setCharAt(2, 'C');
	    s1.setLength(3);
	    logger.info(s1.toString());
	    int p = 010;  			// >Base 8
	    logger.info(Integer.toString(p));
	    logger.info(Integer.toString(0b101)); // base 2

	}


}
