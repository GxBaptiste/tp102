package fr.dta.tp102.TutoJava8;

public class Main {

	final SamList list = SamPersonneDB.PERSONNE.getSubList((person) -> person.age >= 14 && person.age <= 25);
 
//    Assert.assertEquals(3, list.size());
//    Assert.assertTrue(list.contains(new Person("Carson", "Busses", 25)));
//    Assert.assertTrue(list.contains(new Person("Anne", "Derri ", 14)));
//    Assert.assertTrue(list.contains(new Person("Howie", "Kisses", 23)));
}
