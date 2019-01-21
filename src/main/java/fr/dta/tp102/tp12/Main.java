package fr.dta.tp102.tp12;
import fr.dta.tp102.tp10.*;

public class Main {
	
	public static void main(String[] args) {
	Point p = new Point(2,2);
	Carre c = new Carre(p,5);
	Rectangle r = new Rectangle(p,3,4);
	
	r.affiche();
	c.affiche();
	
	
	}
}
