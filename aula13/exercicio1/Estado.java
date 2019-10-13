package aula13.exercicio1;

public class Estado extends Regiao
{

	private String nome;
	private int populacao;
	private Localidade localidade;
	
	public Estado(String nome, int pop, Localidade loc)
	{
		super(nome, pop);
		localidade = loc;
	}
	
	public Localidade getCapital()
	{
		return localidade;
	}
	
	public String getNome()
	{
		return nome;
	}
}
