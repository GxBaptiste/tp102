package fr.dta.tp102.TP11;

import fr.dta.tp102.TP15.Surfacable;
import fr.dta.tp102.TP20.ImpressionHorsLimiteException;

public class Main {

	public static void main(String[] args) throws ImpressionHorsLimiteException {


		// FigureUtil.getRandomRond().affiche();
		// FigureUtil.getRandomRectangle().affiche();
		for (int i = 0; i < 10; i++) {
			System.out.println("\nRANDOM FIGURE : \n");
			FigureUtil.getRandomFigure().affiche();
			System.out.println("\nRANDOM SURFACE : \n");
			Surfacable n = FigureUtil.getRandomSurfacable();
			n.affiche();
			System.out.println("la surface est de : " + n.surface());

		}
	}
}
