package aula09.exercicio3;

public class VetorPessoas 
{
	private int numPessoas = 0;
	private Person[] pessoas;
	
	public VetorPessoas(int initialSize)
	{
		pessoas = new Person[initialSize];
		
	}
	public boolean addPessoa(Person p)
	{
		numPessoas++;
		return true;
	}
	
	public boolean removePessoa(Person p)
	{
		numPessoas--;
		return true;
	}
	
	public int totalPessoas()
	{
		return numPessoas;
	}
	
	public interface Iterator
	{
		boolean hasNext();
		Object next();
		void remove();
	}
}
