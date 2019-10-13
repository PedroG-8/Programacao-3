package aula03.exercicio4.utilizadores;
import aula03.exercicio4.*;

public class Funcionario extends Utilizador {

	protected final int fiscalNumber;
	protected final int workerNumber;
	
	public Funcionario(String name, int fiscalNumber, int cc, int workerNumber, Data birthDate) {
		super(name,cc,birthDate);
		this.fiscalNumber = fiscalNumber;
		this.workerNumber = workerNumber;
		
	}
	
	public int fiscalNumber() { 
		return fiscalNumber;	
	}
	
	public int workerNumber() { 
		return workerNumber; 
	}
	
}