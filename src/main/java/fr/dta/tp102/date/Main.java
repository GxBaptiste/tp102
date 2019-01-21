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

	public static void main(String[] args) {
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		Date date = new Date();
		logger.info("D�but du programme : "+fullDateFormat.format(date));
		logger.info("\n-------------------------------\n");
		
		
		@SuppressWarnings("deprecation")
		Date d = new Date(95,1,1);
		String s = d.toString();
		logger.info(s);
		DayOfWeek dow = DayOfWeek.MONDAY;
		Locale loc = Locale.getDefault();
		logger.info(dow.getDisplayName(TextStyle.FULL, loc));
		logger.info(dow.getDisplayName(TextStyle.SHORT, loc));
		logger.info(dow.getDisplayName(TextStyle.NARROW, loc));
		
		
		
		
		logger.info("\n-------------------------------\n");
	    LocalDateTime date3 = LocalDateTime.of(2019, Month.JANUARY, 25, 21, 0);
	    String dateTexte = "Date de noel : " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(date3);
	    logger.info(dateTexte);
	    
	    Test t = new Test();
	    t.essai();
	    StringBuilder s1 = new StringBuilder();
	    s1.append("testNumero");
	    s1.setCharAt(2, 'C');
	    s1.setLength(3);
	    String res = s1.toString();
	    logger.info(res);

	}


}
