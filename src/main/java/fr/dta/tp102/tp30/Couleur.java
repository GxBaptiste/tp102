package fr.dta.tp102.tp30;

import java.util.concurrent.ThreadLocalRandom;

public enum Couleur {
	ROUGE('R'), VERT('V'), BLEU('B'), JAUNE('J'), NOIR('N');

	private char abrege;

	private Couleur(char s) {
		abrege = s;
	}

	public char getAbrege() {
		return abrege;
	}

	public static Couleur getCouleurDefault() {
		return Couleur.NOIR;
	}

	public static Couleur getRandomCouleur() {
		int nb = ThreadLocalRandom.current().nextInt(Couleur.values().length);
//		System.out.println(Couleur.values()[nb]);
		return Couleur.values()[nb];
	}
}
