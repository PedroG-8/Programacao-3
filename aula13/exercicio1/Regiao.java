package aula13.exercicio1;

public class Regiao
{
	private String nome;
	private int populacao;
	
	public Regiao(String nome, int pop)
	{
		this.nome = nome;
		populacao = pop;
	}
	
	
	public Regiao(Provincia prov)
	{
		this.nome = prov.nome;
		this.populacao = prov.populacao;
	}
	
	public int getPopulacao()
	{
		return populacao;
	}
	
	public String getNome()
	{
		return nome;
	}
}
