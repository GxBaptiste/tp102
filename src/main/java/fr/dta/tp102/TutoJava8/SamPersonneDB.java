package fr.dta.tp102.TutoJava8;

public class SamPersonneDB {
 
    public final static SamList PERSONNE;
 
    static {
    	PERSONNE = new SamList();
        PERSONNE.add(new Personne("Carson", "Busses", 25));
        PERSONNE.add(new Personne("Patty", "Cake", 72));
        PERSONNE.add(new Personne("Anne", "Derri ", 14));
        PERSONNE.add(new Personne("Moe", "Dess", 47));
        PERSONNE.add(new Personne("Leda", "Doggslife", 50));
        PERSONNE.add(new Personne("Dan", "Druff", 38));
        PERSONNE.add(new Personne("Al", "Fresco", 36));
        PERSONNE.add(new Personne("Ido", "Hoe", 2));
        PERSONNE.add(new Personne("Howie", "Kisses", 23));
        PERSONNE.add(new Personne("Len", "Lease", 63));
    }
 
    private SamPersonneDB() {}
}