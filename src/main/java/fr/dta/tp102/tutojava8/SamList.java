package fr.dta.tp102.tutojava8;

import java.util.ArrayList;

public class SamList  extends ArrayList<Personne>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SamList getSubList(final SamPredicate<Personne> sam) {
		final SamList list = new SamList();
		for(Personne p : this) {
			if(sam.test(p)) {
				list.add(p);
			}
		}
		return list;
	}

}
