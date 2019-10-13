package aula01.exercicio2;

public class Person {

	public String name;
	public int cc;
	public Date birthDate;
	
	public Person(String name, int cc, Date birthDate) {
		
		this.name = name;
		this.cc = cc;
	    this.birthDate = birthDate;
	    
	}
	
	public Person() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCC() {
		return this.cc;
	}
	
}