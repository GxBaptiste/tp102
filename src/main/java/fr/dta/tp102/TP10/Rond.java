package fr.dta.tp102.TP10;
import java.util.ArrayList;
import java.util.Collection;

import fr.dta.tp102.TP14.*;
import fr.dta.tp102.TP15.*;
import fr.dta.tp102.TP30.Couleur;

public class Rond extends Figure implements Surfacable{
	
	private Point point;
	private int rayon;
	
	public Rond(Point p, int a) {
		this.point=p;
		this.rayon=a;
		this.couleur=Couleur.getCouleurDefault();
	}
	
	public Rond(Point p, int a,Couleur c) {
		this.point=p;
		this.rayon=a;
		this.couleur=c;
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
	
//	public String getType() {
//		return "ROND";
//	}
	
	public String toString() {
		String msg = "["+getType()+" ["+point.getX()+","+point.getY()+"]"+", "+rayon+"]";
		return msg;
	}
	
	public double surface(){
		double res = Math.PI * (rayon*rayon);
		return res;
	}
	
	public Collection<Point> getPoints() {
		ArrayList<Point> l = new ArrayList<>();
		l.add(point);
		return l;
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
		if(couleur == null) {
			if(other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		return true;
	}

	public boolean couvre(Point p) {
		return rayon>=Math.sqrt(Math.pow((p.getX()-point.getX()),2.0)+Math.pow((p.getY()-point.getY()),2.0));
	}
	
	public ArrayList<Point> getForme(){
		ArrayList<Point> l = new ArrayList<Point>();l.add(point);
		return l;
	}
}
