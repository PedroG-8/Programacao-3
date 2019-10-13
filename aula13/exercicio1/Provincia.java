package aula13.exercicio1;

public class Provincia extends Regiao
{
	protected String nome;
	protected String governador;
	protected int populacao;
	
	public Provincia(String nome, int pop, String gov)
	{
		super(nome, pop);
		governador = gov;
	}
}
