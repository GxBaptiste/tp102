package fr.dta.tp102.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Ecrit extends Thread{

	private String texte;
	private int nombre;
	private int duree;
	private static final  Logger logger = LoggerFactory.getLogger(Ecrit.class);
	
	public Ecrit(String t,int nb,int du) {
		texte=t;
		nombre=nb;
		duree=du;
	}
	
	@Override
	public void run() {
		for(int i=0;i<nombre;i++) {
			logger.info(texte);
			try {
				Thread.sleep(duree);
			} catch (InterruptedException e) {
				logger.info("\nFin du Thread : "+e.getMessage()+"\n");
				Thread.currentThread().interrupt();
			}
			
		}
	}
}
