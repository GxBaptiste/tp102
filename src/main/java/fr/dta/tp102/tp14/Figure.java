package fr.dta.tp102.tp14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import fr.dta.tp102.tp10.Point;
import fr.dta.tp102.tp30.*;

public abstract class Figure implements Comparable<Figure> {

	public static int cpt=0;
	protected Couleur couleur;
	
	public void affiche() {
		System.out.println(toString()+" et de couleur : "+couleur.name());
	}

	public abstract String toString();

	public String getType() {
		cpt++;
		return this.getClass()+" "+cpt;

	}

	public abstract Collection<Point> getPoints();

	public abstract boolean couvre(Point p);

	

	public double distanceOrigine() {
		Point p = new Point();
		ArrayList<Double> l = new ArrayList<>();
		ArrayList<Point> liste_points = (ArrayList<Point>) this.getPoints();
		for (int i = 0; i < this.getPoints().size(); i++) {
			l.add(liste_points.get(i).distance(p));
		}
		return l.stream().sorted().collect(Collectors.toList()).get(0);

	}
	public String getId() {
		cpt++;
		return this.getClass().getName()+" "+cpt;
	}
	
	@Override
	public int compareTo(Figure f) {
		if(this.distanceOrigine() > f.distanceOrigine())
			return 1;
		else {
			if(this.distanceOrigine() < f.distanceOrigine()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	
	public Couleur getCouleur() {
		return couleur;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figure other = (Figure) obj;
		if (couleur != other.couleur)
			return false;
		return true;
	}
	
	public abstract ArrayList<Point> getForme();
	
}
