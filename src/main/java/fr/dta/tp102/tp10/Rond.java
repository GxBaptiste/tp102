package fr.dta.tp102.tp10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.dta.tp102.tp14.*;
import fr.dta.tp102.tp15.*;
import fr.dta.tp102.tp30.Couleur;

public class Rond extends Figure implements Surfacable {

	private Point point;
	private int rayon;

	public Rond(Point p, int a) {
		this.point = p;
		this.rayon = a;
		this.couleur = Couleur.getCouleurDefault();
	}

	public Rond(Point p, int a, Couleur c) {
		this.point = p;
		this.rayon = a;
		this.couleur = c;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public String toString() {
		return "[" + getType() + " [" + point.getX() + "," + point.getY() + "]" + ", " + rayon + "]";
	}

	public double surface() {
		return Math.PI * (rayon * rayon);
	}

	public Collection<Point> getPoints() {
		ArrayList<Point> l = new ArrayList<>();
		l.add(point);
		return l;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((point == null) ? 0 : point.hashCode());
		result = prime * result + rayon;
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
		Rond other = (Rond) obj;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		if (rayon != other.rayon)
			return false;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		return true;
	}

	public boolean couvre(Point p) {
		return rayon >= Math.sqrt(Math.pow((p.getX() - point.getX()), 2.0) + Math.pow((p.getY() - point.getY()), 2.0));
	}

	public List<Point> getForme() {
		List<Point> l = new ArrayList<>();
		l.add(point);
		return l;
	}
}
