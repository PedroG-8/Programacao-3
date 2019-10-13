package aula06.exercicio1;

public final class Carne extends Alimento {

	private final VariedadeDeCarne tipo;
	
	public Carne(VariedadeDeCarne tipo, double calorias, double proteinas, double peso) {
		super(calorias, proteinas, peso);
		this.tipo = tipo;
	}
	
	public VariedadeDeCarne getTipo() {
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
		Carne other = (Carne) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	@Override 
	public String toString() {
		return "Carne " + getTipo() + ", " + super.toString();
	}
}
