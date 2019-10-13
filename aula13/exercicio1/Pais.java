package aula13.exercicio1;
import java.util.ArrayList;

public class Pais
{
	private String nome;
	private Localidade capital;
	private ArrayList<Regiao> regioes = new ArrayList<>();
	
	public Pais(String nome, Regiao reg)
	{
		this.nome = nome;
		regioes.add(reg);
	}
	
	public Pais(String nome, Localidade capital)
	{
		this.nome = nome;
		this.capital = capital;
		if(capital.getTipo() != TipoLocalidade.Cidade)
		{
			throw new IllegalArgumentException("Capital Inválida, não pode ser uma " + capital.getTipo());
		}
	}
	
	public Pais(String nome)
	{
		this.nome = nome;
	}
	
	public void addRegiao(Regiao reg)
	{
		regioes.add(reg);
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getPopulacao()
	{
		int pop = 0;
		for (Regiao regiao : regioes) {
			pop = pop + regiao.getPopulacao();
		}
		return pop;
	}
	
	@Override
	public String toString()
	{
		return String.format("Pais: %s, Populaçao: %d (Capital %s)", getNome(), getPopulacao(), capital == null ? "*Indefinida*" : capital.toString());
	}
}
