package fr.dta.tp102.tp20;

import java.io.IOException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.dta.tp102.tp10.Point;
import fr.dta.tp102.tp10.Rectangle;
import fr.dta.tp102.tp10.Rond;
import fr.dta.tp102.tp11.FigureUtil;
import fr.dta.tp102.tp12.Carre;
import fr.dta.tp102.tp14.Figure;
import fr.dta.tp102.tp15.Segment;

public class Main {
	
	private static final  Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws IOException {

		Collection<Figure> f1 = FigureUtil.genere(10);
		for (Figure f : f1) {
			f.affiche();
		}
		String rert = "\n \n";
		logger.info(rert);

		Point p = new Point(3, 5);
		Point p2 = new Point(5, 7);
		Point p3 = new Point(5, 9);
		Point p4 = new Point(1, 1);

		Carre c = new Carre(p, 2);
		Carre c2 = new Carre(p, 2);
		Carre c3 = new Carre(p2, 3);

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
		logger.info("TEST du getFIgure : " + FigureUtil.getFigureEn(p, d));
		logger.info("TEST du getFig : " + FigureUtil.getFigureEn(p4, d2));
		logger.info("TEST du getFIgEn : " + FigureUtil.getFigureEn(p5, d3));

		logger.info(rert);
		logger.info("liste des true : ");

		logger.info("",c.equals(c2));
		logger.info("",r.equals(r2));
		logger.info("",rect.equals(rect2));
		logger.info("",c3.equals(rect4));

		logger.info(" \n ");
		logger.info("liste des false : ");
		logger.info("",c.equals(c3));
		logger.info("",r.equals(r3));
		logger.info("",rect.equals(rect3));

		logger.info(" \n ");
		logger.info("",p.distance(p2));
		logger.info("",p.distance(p3));

		logger.info(rert);
		logger.info("",rect3.distanceOrigine());

		logger.info(rert);
		Carre c10 = new Carre(new Point(2, 2), 6);
		Carre c11 = new Carre(new Point(5, 5), 3);
		Rectangle c12 = new Rectangle(new Point(4, 4), 2, 5);
		Rond c13 = new Rond(new Point(1, 1), 2);
		Dessin d10 = new Dessin();
		d10.add(c10);
		d10.add(c11);
		d10.add(c12);
		d10.add(c13);
		Collection<Figure> res = FigureUtil.trieProcheOrigine(d10);
		logger.info("",res);
		logger.info("",FigureUtil.trieSurface(d10));

		logger.info("\n \n ");


		FigureUtil.clearMap();
		FigureUtil.genere(50);
		logger.info("",FigureUtil.getMap());

		logger.info("------------ IMPRIME ------------");

		try {
			String save = FigureUtil.imprim();
			FigureUtil.sauvegarde(save);
		} catch (IOException e) {
			logger.info("Erreur d'IOException");
		}


		String[][] tab = FigureUtil.charger();
		for (int i = 0; i < 100; i++) {
			for (int y = 0; y < 100; y++) {
				if (y <= 98)
					logger.info("",tab[i][y]);
				else
					logger.info(tab[i][y]);
			}

		}

	}
}
