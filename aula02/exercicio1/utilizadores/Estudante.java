package aula02.exercicio1.utilizadores;
import aula02.exercicio1.*;

public class Estudante extends Utilizador { 
	
	protected final String course;
	protected final int nmec;
	
	public Estudante(String name, String course, int cc, int nmec, Data birthDate){
		super(name, cc, birthDate);
		this.course = course;
		this.nmec = nmec;
		
	}
	
	public String course() { 
		return course; 
	}
	
	public int nmec() { 
		return nmec; 
	}
}