package fr.dta.tp102.tp20;

import java.util.ArrayList;
import java.util.Collection;

import fr.dta.tp102.tp14.Figure;

public class Dessin {

	ArrayList<Figure> l;

	public Dessin() {
		l = new ArrayList<Figure>();
	}

	public boolean add(Figure f) {
		return l.add(f);
	}

	public Collection<Figure> getFigures() {
		return l;
	}
}
