package fr.dta.tp102.tutoJava8;

public class Personne {
	
	private String fname;
	private String lname;
	private int age;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Personne(String l,String f,int a) {
		fname=f;lname=l;age=a;
	}

}
