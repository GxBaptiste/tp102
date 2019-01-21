package fr.dta.tp102.tutoJava8;

public class Main {

	final SamList list = SamPersonneDB.PERSONNE.getSubList((person) -> person.getAge() >= 14 && person.getAge() <= 25);
 
//    Assert.assertEquals(3, list.size());
//    Assert.assertTrue(list.contains(new Person("Carson", "Busses", 25)));
//    Assert.assertTrue(list.contains(new Person("Anne", "Derri ", 14)));
//    Assert.assertTrue(list.contains(new Person("Howie", "Kisses", 23)));
}
