package fr.dta.tp102.tp11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import fr.dta.tp102.tp10.Point;
import fr.dta.tp102.tp10.Rectangle;
import fr.dta.tp102.tp10.Rond;
import fr.dta.tp102.tp12.Carre;
import fr.dta.tp102.tp14.Figure;
import fr.dta.tp102.tp15.Segment;
import fr.dta.tp102.tp15.Surfacable;
import fr.dta.tp102.tp20.Dessin;
import fr.dta.tp102.tp20.ImpressionHorsLimiteException;
import fr.dta.tp102.tp30.Couleur;

public class FigureUtil {
	
	
	public static final  Logger logger = LoggerFactory.getLogger(FigureUtil.class);

	protected static final HashMap<String, Figure> map = new HashMap<>();
	public static HashMap<String, Figure> getMap() {
		return map;
	}

	private static final int RAND = 50;

	public static Rond getRandomRond(Couleur c) {

		Random rayon = new Random();
		int rayonRond = rayon.nextInt(RAND);
		Rond rond = new Rond(getRandomPoint(), rayonRond, c);
		map.put(rond.getId(), rond);
		return rond;
	}

	public static Rectangle getRandomRectangle(Couleur c) {

		Random r = new Random();
		Random r2 = new Random();
		int n = r.nextInt(RAND);
		int n2 = r2.nextInt(RAND);
		Rectangle rect = new Rectangle(getRandomPoint(), n, n2, c);
		map.put(rect.getId(), rect);
		return rect;

	}

	public static Carre getRandomCarre(Couleur c) {

		Random r = new Random();
		int n = r.nextInt(RAND);
		Carre carre = new Carre(getRandomPoint(), n, c);
		map.put(carre.getId(), carre);
		return carre;
	}

	public static Segment getRandomSegment(Couleur c) {

		Random r = new Random();
		int n = r.nextInt(RAND);
		Segment seg;
		if (n % 2 == 0) {
			seg = new Segment(getRandomPoint(), n, true, c);
		} else {
			seg = new Segment(getRandomPoint(), n, false, c);
		}
		map.put(seg.getId(), seg);
		return seg;
	}

	private static Point getRandomPoint() {

		Random r = new Random();
		Random r2 = new Random();
		int n = r.nextInt(RAND);
		int n2 = r2.nextInt(RAND);
		Point p;
		p = new Point(n, n2);
		return p;
	}

	public static Figure getRandomFigure() {

		Random nb = new Random();
		int nbC = nb.nextInt(4);
		switch (nbC) {
		case 0:
			return getRandomRond(Couleur.getRandomCouleur());
		case 1:
			return getRandomRectangle(Couleur.getRandomCouleur());
		case 2:
			return getRandomCarre(Couleur.getRandomCouleur());
		default:
			return getRandomSegment(Couleur.getRandomCouleur());
		}
	}

	public static Surfacable getRandomSurfacable() {
		Random nb = new Random();
		int nbC = nb.nextInt(3);
		switch (nbC) {
		case 0:
			return getRandomRond(Couleur.getRandomCouleur());
		case 1:
			return getRandomRectangle(Couleur.getRandomCouleur());
		default:
			return getRandomCarre(Couleur.getRandomCouleur());
		}
	}

	public static Collection<Collection<Point>> getPoints(Figure... cf) {
		Collection<Collection<Point>> lp = new ArrayList<>();
		for (Figure f : cf) {
			Collection<Point> aux = new ArrayList<>(f.getPoints());
			lp.add(aux);
		}
		return lp;
	}

	public static Collection<Figure> genere(int n) {
		Collection<Figure> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Figure f = getRandomFigure();
			l.add(f);
		}
		return l;
	}

	public static Figure getFigureEn(Point p, Dessin d) {
		ArrayList<Figure> l = new ArrayList<>();
		l.addAll(d.getFigures());
		Iterator<Figure> iter = l.iterator();
		int cpt = 0;
		while (iter.hasNext()) {
			if (l.get(cpt).couvre(p)) {
				return l.get(cpt);
			}
			iter.next();
			cpt++;
		}
		return null;
	}

	public static Collection<Figure> trieProcheOrigine(Dessin d) {
		ArrayList<Figure> lFigure = new ArrayList<>(d.getFigures());
		return lFigure.stream().sorted().collect(Collectors.toList());
	}

	public static Collection<Figure> trieSurface(Dessin d) {
		return d.getFigures().stream().filter(x -> x instanceof Surfacable).sorted((x1, x2) -> {
			Surfacable s1 = (Surfacable) x1;
			Surfacable s2 = (Surfacable) x2;
			if (s1.surface() > s2.surface()) {
				return 1;
			} else if (s1.surface() < s2.surface()) {
				return -1;
			}
			return 0;
		}).collect(Collectors.toList());
	}

	public static Collection<Point> get(Map<String, Collection<Point>> hm, String id) {
		return hm.get(id);
	}

	public static void test(Point p) throws ImpressionHorsLimiteException {
		if (p.getX() < 0 || p.getX() > 99 || p.getY() < 0 || p.getY() > 99) {
			throw new ImpressionHorsLimiteException("Figure hors des limites d'impression");
		}
	}

	public static void clearMap() {
		map.clear();
	}

	public static String imprim() {
		StringBuilder str = new StringBuilder();
		String[][] tab = new String[100][100];
		StringBuilder aux = new StringBuilder();

		for (int i = 0; i < 100; i++) {
			for (int y = 0; y < 100; y++) {
				tab[i][y] = " ";
			}
		}
		for (Entry<String, Figure> s : map.entrySet()) {
			str.append(s.getKey() + " " + s.getValue() + "\r\n");
		}
		for (int i = 0; i < 100; i++) {
			aux.append("=");
		}

		str.append("Sauvegarde.txt\r\n");
		str.append(aux + "\r\n");
		aux = new StringBuilder();

		for (Entry<String, Figure> s : map.entrySet()) {	
			Figure fig = s.getValue();
			for (Point p : fig.getForme()) {
				try {
					test(p);
					String aux2 = Character.toString(fig.getCouleur().getAbrege());
					tab[p.getX()][p.getY()] = aux2;
				} catch (ImpressionHorsLimiteException e) {
					logger.info("",e.getMessage());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int y = 0; y < 100; y++) {
				aux.append(tab[i][y]);
			}
			str.append(aux + "\r\n");
			aux = new StringBuilder();
		}
		return str.toString();
	}

	public static void sauvegarde(String save) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Sauvegarde.txt")));
		try(PrintWriter pw = new PrintWriter(writer)) {
			pw.println(save);
		}
		finally {
			writer.close();
		}
	}
	
	public static String[][] charger() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("Sauvegarde.txt"));
		String[][] tab = new String[100][100];
		try {
			
			String l;
			int cpt=0;
			boolean au = false;
			while((l = reader.readLine()) != null){
			
				if(au && l.length()!=0) {
					for(int i=0;i<100;i++) {
						tab[cpt][i]=Character.toString(l.charAt(i));
					}
					
					if(cpt!=99)
						cpt++;
				}
				else {
					if(l.length()!=0) {
						if(l.charAt(0)=='=')
							au=true;
					}
				}
			}
		}
		catch(IOException ioe) {
			logger.info("Erreur --"+ ioe.toString());
		}
		finally {
			reader.close();
		}
		return tab;
	}
}
