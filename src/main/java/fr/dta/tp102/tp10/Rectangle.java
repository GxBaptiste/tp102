package fr.dta.tp102.tp10;

import java.util.ArrayList;
import java.util.Collection;

import fr.dta.tp102.tp14.Figure;
import fr.dta.tp102.tp15.Surfacable;
import fr.dta.tp102.tp30.Couleur;

public class Rectangle extends Figure implements Surfacable {

	private Point p1; // bas gauche
	private Point p2; // haut gauche
	private Point p4; // haut droite
	private Point p3; // bas droite

	/*
	 * private Point p; private int xlong; private int ylong;
	 */

	public Rectangle(Point po, int la, int lo) {

		p3 = new Point(po.getX() + la, po.getY());
		p2 = new Point(po.getX(), po.getY() + lo);
		p1 = po;
		p4 = new Point(po.getX() + la, po.getY() + lo);
		couleur = Couleur.getCouleurDefault();

	}

	public Rectangle(Point po, int la, int lo, Couleur c) {

		p3 = new Point(po.getX() + la, po.getY());
		p2 = new Point(po.getX(), po.getY() + lo);
		p1 = po;
		p4 = new Point(po.getX() + la, po.getY() + lo);
		couleur = c;

	}

	public Point getPointBasGauche() {
		return p1;
	}

	public Point getPointBasDroit() {
		// Point p = new Point(this.p.getX(),this.p.getY()+ylong);
		return p2;
	}

	public Point getPointHautGauche() {
		// Point p = new Point(this.p.getX()+xlong,this.p.getY());
		return p3;
	}

	public Point getPointHautDroit() {
		// Point p = new Point(this.p.getX()+xlong,this.p.getY()+ylong);
		return p4;
	}

//	public String getType() {
//		return "RECT";
//	}

	public String toString() {
		String msg = "[" + getType() + " " + p1.toString() + "," + p2.toString() + "," + p3.toString() + ","
				+ p4.toString() + "]";
		return msg;
	}

	public double surface() {
		double res = (p4.getX() - p1.getX()) * ((double) p4.getY() - (double) p1.getY());
		return res;
	}

	public Collection<Point> getPoints() {
		ArrayList<Point> l = new ArrayList<>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		return l;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
		result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
		result = prime * result + ((p3 == null) ? 0 : p3.hashCode());
		result = prime * result + ((p4 == null) ? 0 : p4.hashCode());
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
		Rectangle other = (Rectangle) obj;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		if (p3 == null) {
			if (other.p3 != null)
				return false;
		} else if (!p3.equals(other.p3))
			return false;
		if (p4 == null) {
			if (other.p4 != null)
				return false;
		} else if (!p4.equals(other.p4))
			return false;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		return true;
	}

	public boolean couvre(Point p) {
		return (p.getX() >= p1.getX() && p.getX() <= p2.getY()) && (p.getY() >= p1.getY() && p.getY() <= p4.getY());
	}

	public ArrayList<Point> getForme() {
		ArrayList<Point> l = new ArrayList<>();
		for (int y = p1.getY(); y < p4.getY(); y++) {
			for (int i = p1.getX(); i < p4.getX(); i++) {
				l.add(new Point(i, y));
			}
		}
		return l;
	}

}
