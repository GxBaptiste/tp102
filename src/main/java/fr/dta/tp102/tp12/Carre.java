package fr.dta.tp102.tp12;
import fr.dta.tp102.tp10.*;
import fr.dta.tp102.tp30.Couleur;

public class Carre extends Rectangle {
	
	public Carre(Point p,int x) {
		super(p,x,x);
	}
	
	public Carre(Point p,int x,Couleur c) {
		super(p,x,x);
		couleur=c;
	}



}
