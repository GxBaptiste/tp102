package fr.dta.tp102.tp14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.dta.tp102.tp10.Point;
import fr.dta.tp102.tp30.*;

public abstract class Figure implements Comparable<Figure> {

	public static final Logger logger = LoggerFactory.getLogger(Figure.class);
	private static int cpt;
	public static int getCpt() {
		return cpt;
	}

	protected Couleur couleur;

	public void affiche() {
		String coul = couleur.name();
		logger.info(toString() + " et de couleur : " + coul);
	}

	public abstract String toString();

	public String getType() {
		incr();
		return this.getClass() + " " + cpt;
	}
	
	public static void incr() {
		if(cpt==0) {
			cpt=1;
		}
		else {
			cpt++;
		}
	}

	public abstract Collection<Point> getPoints();

	public abstract boolean couvre(Point p);

	public double distanceOrigine() {
		Point p = new Point();
		ArrayList<Double> l = new ArrayList<>();
		ArrayList<Point> listePoints = (ArrayList<Point>) this.getPoints();
		for (int i = 0; i < this.getPoints().size(); i++) {
			l.add(listePoints.get(i).distance(p));
		}
		return l.stream().sorted().collect(Collectors.toList()).get(0);

	}

	public String getId() {
		incr();
		return this.getClass().getName() + " " + cpt;
	}

	@Override
	public int compareTo(Figure f) {
		if (this.distanceOrigine() > f.distanceOrigine())
			return 1;
		else {
			if (this.distanceOrigine() < f.distanceOrigine()) {
				return -1;
			} else {
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
		boolean res = true;
		if (this == obj)
			return res;
		if (obj == null)
			return !res;
		if (getClass() != obj.getClass())
			return !res;
		Figure other = (Figure) obj;
		if (couleur != other.couleur)
			res=false;
		return res;
	}

	public abstract List<Point> getForme();

}
