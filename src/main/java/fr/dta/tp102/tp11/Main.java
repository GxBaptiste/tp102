package fr.dta.tp102.tp11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.dta.tp102.tp15.Surfacable;

public class Main {

	public static final Logger logger = LoggerFactory.getLogger(Main.class);

	
	public static void main(String[] args){

		for (int i = 0; i < 10; i++) {
			logger.info("\nRANDOM FIGURE : \n");
			FigureUtil.getRandomFigure().affiche();
			logger.info("\nRANDOM SURFACE : \n");
			Surfacable n = FigureUtil.getRandomSurfacable();
			n.affiche();
			Double res = n.surface();
			logger.info("la surface est de : ",res);

		}
	}
}
