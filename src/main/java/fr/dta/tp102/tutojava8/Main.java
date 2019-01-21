package fr.dta.tp102.tutojava8;

public class Main {

	final SamList list = SamPersonneDB.PERSONNE.getSubList(person -> person.getAge() >= 14 && person.getAge() <= 25);
}
