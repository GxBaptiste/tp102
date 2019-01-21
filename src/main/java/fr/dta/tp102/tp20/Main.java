package fr.dta.tp102.tp20;

import java.io.IOException;
import java.util.Collection;

import fr.dta.tp102.tp10.Point;
import fr.dta.tp102.tp10.Rectangle;
import fr.dta.tp102.tp10.Rond;
import fr.dta.tp102.tp11.FigureUtil;
import fr.dta.tp102.tp12.Carre;
import fr.dta.tp102.tp14.Figure;
import fr.dta.tp102.tp15.Segment;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * for(int i=0;i<10;i++) { Figure f = FigureUtil.getRandomFigure();
		 * Collection<Point> l = f.getpoints();
		 * System.out.println("Figure n� "+(i+1)+" et de type : "+f.getType());
		 * for(Point p : l) { System.out.println(p); } }
		 */
//		Collection<Figure> cf = new ArrayList<Figure>();
//		for(int i=0;i<5;i++) {
//			cf.add(FigureUtil.getRandomFigure());
//		}

		Collection<Figure> f1 = FigureUtil.genere(10);
		for (Figure f : f1) {
			f.affiche();
		}

		System.out.println("\n \n ");

		Point p = new Point(3, 5);
		Point p2 = new Point(5, 7);
		Point p3 = new Point(5, 9);
		Point p4 = new Point(1, 1);

		Carre c = new Carre(p, 2);
		Carre c2 = new Carre(p, 2);
		Carre c3 = new Carre(p2, 3);
//		Carre c4 = new Carre(new Point(0, 0), 5);

		Rond r = new Rond(new Point(2, 5), 2);
		Rond r2 = new Rond(new Point(2, 5), 2);
		Rond r3 = new Rond(new Point(2, 5), 3);
		Rond r4 = new Rond(new Point(0, 0), 2);

		Rectangle rect = new Rectangle(p2, 3, 5);
		Rectangle rect2 = new Rectangle(p2, 3, 5);
		Rectangle rect3 = new Rectangle(p, 3, 6);
		Rectangle rect4 = new Rectangle(p2, 3, 3);

		Segment s1 = new Segment(new Point(1, 1), 6, true);
		Point p5 = new Point(2, 1);

		Dessin d = new Dessin();
		d.add(c);
		d.add(r);
		d.add(rect);
		Dessin d2 = new Dessin();
		d2.add(r4);
		Dessin d3 = new Dessin();
		d3.add(s1);
		System.out.println("TEST du getFIgureEn : " + FigureUtil.getFigureEn(p, d));
		System.out.println("TEST du getFIgureEn : " + FigureUtil.getFigureEn(p4, d2));
		System.out.println("TEST du getFIgureEn : " + FigureUtil.getFigureEn(p5, d3));

		System.out.println("\n \n ");
		System.out.println("liste des true : ");

		System.out.println(c.equals(c2));
		System.out.println(r.equals(r2));
		System.out.println(rect.equals(rect2));
		System.out.println(c3.equals(rect4));

		System.out.println(" \n ");
		System.out.println("liste des false : ");
		System.out.println(c.equals(c3));
		System.out.println(r.equals(r3));
		System.out.println(rect.equals(rect3));

		System.out.println(" \n ");
		System.out.println(p.distance(p2));
		System.out.println(p.distance(p3));

		System.out.println("\n \n ");
		System.out.println(rect3.distanceOrigine());

		System.out.println("\n \n ");
		Carre c10 = new Carre(new Point(2, 2), 6);
		Carre c11 = new Carre(new Point(5, 5), 3);
		Rectangle c12 = new Rectangle(new Point(4, 4), 2, 5);
		Rond c13 = new Rond(new Point(1, 1), 2);
		Dessin d10 = new Dessin();
		d10.add(c10);
		d10.add(c11);
		d10.add(c12);
		d10.add(c13);
		System.out.println("ekjekekeekeke" + FigureUtil.trieProcheOrigine(d10));
		System.out.println(FigureUtil.trieSurface(d10));

		System.out.println("\n \n ");

//		HashMap<String,Collection<Point>> map1 = FigureUtil.getRandomXX();
//		System.out.println(map1);
//		System.out.println("test d'un rect :"+FigureUtil.get(map1,"RECT"));
//		System.out.println("test d'un carre :"+FigureUtil.get(map1,"CARRE"));
//		System.out.println("test d'un rond :"+FigureUtil.get(map1,"ROND"));
//		System.out.println("test d'un segment :"+FigureUtil.get(map1,"SEGM"));
//		
//		System.out.println("\n \n ");
//		
//		HashMap<String,Collection<Point>> hmp1 = FigureUtil.getRandomXX();

		FigureUtil.clearMap();
		FigureUtil.genere(50);
		System.out.println(FigureUtil.getMap());

		System.out.println("------------ IMPRIME ------------");

		// try {
		try {
			String save = FigureUtil.imprim();
			FigureUtil.sauvegarde(save);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * } catch (ImpressionHorsLimiteException e) {
		 * System.out.println("Hors Limite Exception : "+e.getMessage());
		 * e.printStackTrace(); }
		 */

//		System.out.println("------------ Equals avec une Couleur ------------");
//		
//		Figure f10 = new Carre(new Point(0,0),5,Couleur.BLEU);
//		Figure f11 = new Carre(new Point(0,0),5,Couleur.BLEU);
//		Figure f12 = new Carre(new Point(0,0),7,Couleur.BLEU);
//		System.out.println(f10.equals(f11));
//		System.out.println(f10.equals(f12));

		String[][] tab = FigureUtil.charger();
		for (int i = 0; i < 100; i++) {
			for (int y = 0; y < 100; y++) {
				if (y <= 98)
					System.out.print(tab[i][y]);
				else
					System.out.println(tab[i][y]);
			}

		}

//		Segment s10 = new Segment(new Point(1,1),5,true);
//		System.out.println(s10.getForme());
	}
}
