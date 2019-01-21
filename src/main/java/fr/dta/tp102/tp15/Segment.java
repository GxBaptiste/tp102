package fr.dta.tp102.tp15;
import java.util.ArrayList;
import java.util.Collection;

import fr.dta.tp102.tp10.Point;
import fr.dta.tp102.tp14.Figure;
import fr.dta.tp102.tp30.Couleur;

public class Segment extends Figure{
	
	Point p1;
	Point p2;
	
	public Segment(Point d,int lon, boolean horizon)  {
		if(horizon==true) {
			p1=d;
			p2=new Point(d.getX()+lon,d.getY());
		}
		else {
			p1=d;
			p2=new Point(d.getX(),d.getY()+lon);
		}
		couleur=Couleur.getCouleurDefault();
	}
	
	public Segment(Point d,int lon, boolean horizon,Couleur c)  {
		if(horizon==true) {
			p1=d;
			p2=new Point(d.getX()+lon,d.getY());
		}
		else {
			p1=d;
			p2=new Point(d.getX(),d.getY()+lon);
		}
		couleur=c;
	}
	
	public String toString() {
		return "["+getType()+" "+p1+" a "+p2+"]";
	}
	
//	public String getType() {
//		return "SEGM";
//	}
	public Collection<Point> getPoints() {
		ArrayList<Point> l = new ArrayList<>();
		l.add(p1);l.add(p2);
		return l;
	}
	
	public double longeur() {
		return (p1.getX()+p2.getX())+((double) p1.getY()+ (double) p2.getY());
	}



	public boolean couvre(Point p) {
		return p.getX()>=p1.getX() && p.getX()<=p2.getX() && p.getY()==p1.getY() || p.getY()>=p1.getY() && p.getY()<=p2.getY() && p.getX()==p1.getX();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
		result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segment other = (Segment) obj;
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
		if(couleur == null) {
			if(other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		return true;
	}
	
	public ArrayList<Point> getForme(){
		ArrayList<Point> l = new ArrayList<>();
		if(p1.getX()<p2.getX()){
			for(int i=p1.getX();i<=p2.getX();i++) {
				l.add(new Point(i,p1.getY()));
			}
		}
		if(p1.getX()>p2.getX()) {
			for(int i=p2.getX();i<=p1.getX();i++) {
				l.add(new Point(i,p1.getY()));
			}
		}
		if(p1.getY()<p2.getY()){
			for(int i=p1.getY();i<=p2.getY();i++) {
				l.add(new Point(i,p1.getX()));
			}
		}
		if(p1.getY()>p2.getY()) {
			for(int i=p2.getY();i<=p1.getY();i++) {
				l.add(new Point(i,p1.getX()));
			}
		}
		return l;
	}


}
