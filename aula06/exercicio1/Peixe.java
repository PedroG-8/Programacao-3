package aula06.exercicio1;

public final class Peixe extends Alimento {

	private final TipoDePeixe tipo;
	
	public Peixe(TipoDePeixe tipo, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		this.tipo = tipo;
	}
	
	public TipoDePeixe getTipo() {
		return tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Peixe other = (Peixe) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	@Override 
	public String toString() {
		return "Peixe " + getTipo() + ", " + super.toString();
	}
}
