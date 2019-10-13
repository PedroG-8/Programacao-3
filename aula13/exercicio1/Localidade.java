package aula13.exercicio1;

public class Localidade 
{

	private String nome;
	private int populacao;
	private TipoLocalidade tipoLocalidade;
	
	public Localidade(String nome, int pop, TipoLocalidade tl)
	{
		this.nome = nome;
		populacao = pop;
		tipoLocalidade = tl;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getPopulacao()
	{
		return populacao;
	}
	
	public TipoLocalidade getTipo()
	{
		return tipoLocalidade;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s, populaçao %d", getNome(), getPopulacao());
	}
}
