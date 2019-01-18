package fr.dta.tp102.Thread;

public class Main {

	public static void main(String[] args) {
		
		Ecrit e1 = new Ecrit("Hey",10,500);
		Ecrit e2 = new Ecrit("Hello",12,1000);
		Ecrit e3 = new Ecrit("Nop\n",5,1000);
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		t1.start();t2.start();t3.start();
		
		t3.interrupt();
	}

}
