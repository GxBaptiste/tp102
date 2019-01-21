package fr.dta.tp102.thread;

public class Ecrit extends Thread{

	private String texte;
	private int nombre;
	private int duree;
	
	public Ecrit(String t,int nb,int du) {
		texte=t;
		nombre=nb;
		duree=du;
	}
	
	@Override
	public void run() {
		for(int i=0;i<nombre;i++) {
			System.out.println(texte);
			try {
				Thread.sleep(duree);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("\nFin du Thread : "+e.getMessage()+"\n");
				Thread.currentThread().interrupt();
			}
			
		}
	}
}
