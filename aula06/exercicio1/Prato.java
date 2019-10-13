package aula06.exercicio1;
import java.util.LinkedList;

public class Prato implements Comparable <Prato> {

	private final String nome;
	private final LinkedList<Alimento> conjuntoAlimentos;
	private double totalCalorias = 0;
	
	public Prato(String nome) {
		this.nome = nome;
		conjuntoAlimentos = new LinkedList<>();
	}
	
	public boolean addIngrediente(Alimento a) {
		if(conjuntoAlimentos.contains(a)) {
			return false;
		}
		else {
			conjuntoAlimentos.add(a);
			totalCalorias = totalCalorias + a.getCalorias();
			return true;
		}
	}
	
	public boolean exists(Alimento a) {
		return conjuntoAlimentos.contains(a);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getTotalCalorias() {
		return totalCalorias;
	}
	
	public int getNumAlimentos() {
		return conjuntoAlimentos.size();
	}
	
	public Alimento[] getAlimentos() {
		return conjuntoAlimentos.toArray(new Alimento[0]);
	}
	
	@Override
	public String toString() {
		return "Prato '" + nome + "' composto por " + getNumAlimentos() + " Ingredientes";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conjuntoAlimentos == null) ? 0 : conjuntoAlimentos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		if (conjuntoAlimentos == null) {
			if (other.conjuntoAlimentos != null)
				return false;
		} else if (!conjuntoAlimentos.equals(other.conjuntoAlimentos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(totalCalorias) != Double.doubleToLongBits(other.totalCalorias))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Prato prato2) {
		return (int)(totalCalorias-prato2.totalCalorias);
	}
}
