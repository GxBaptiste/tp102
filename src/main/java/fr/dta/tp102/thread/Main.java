package fr.dta.tp102.thread;

public class Main {

	public static void main(String[] args) {
		
		Runnable e1 = new Ecrit("Hey",10,500);
		Runnable e2 = new Ecrit("Hello",12,1000);
		Runnable e3 = new Ecrit("Nop\n",5,1000);
		
		new Thread(e1).start();
		new Thread(e2).start();
		new Thread(e3).start();
	}

}
