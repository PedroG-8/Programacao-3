package aula04.exercicio1;

public class Professor extends Pessoa {

	private int numFunc;
	private Data dataDeAdm;
	
	public Professor(String nome, int cc, Data dataDeNasc) {
		super(nome, cc, dataDeNasc);
	}
	
	public Professor(String nome, int cc, Data dataDeNasc, int numF, Data dataDeAdm) {
		super(nome, cc, dataDeNasc);
		numFunc = numF;
		this.dataDeAdm = dataDeAdm;
	}
	
	public int numFunc() {
		return numFunc;
	}
	
	public Data dataDeAdm() {
		return dataDeAdm;
	}
}
