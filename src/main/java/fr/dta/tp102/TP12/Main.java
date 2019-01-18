package fr.dta.tp102.TP12;
import fr.dta.tp102.TP10.*;
import fr.dta.tp102.TP20.ImpressionHorsLimiteException;

public class Main {
	
	public static void main(String[] args) throws ImpressionHorsLimiteException {
	Point p = new Point(2,2);
	Carre c = new Carre(p,5);
	Rectangle r = new Rectangle(p,3,4);
	
	r.affiche();
	c.affiche();
	
	
	}
}
