package fr.dta.tp102.TP12;
import fr.dta.tp102.TP10.*;
import fr.dta.tp102.TP30.Couleur;

public class Carre extends Rectangle {
	
	public Carre(Point p,int x) {
		super(p,x,x);
	}
	
	public Carre(Point p,int x,Couleur c) {
		super(p,x,x);
		couleur=c;
	}
	
//	public String getType() {
//		return "CARRE";
//	}

	
//	public void affiche() {
//		System.out.println(toString());
//	}


}
