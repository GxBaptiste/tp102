package fr.dta.tp102.tp10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
	
	private static final  Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {


			Point p3 = new Point(3,5);
			Point p2 = new Point(3,5);
			Point p4 = new Point(4,8);
			
			logger.info("",p3.equals(p2));
			logger.info("",p3.equals(p4));

	
	}


}
