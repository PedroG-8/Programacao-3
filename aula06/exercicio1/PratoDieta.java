package aula06.exercicio1;

public class PratoDieta extends Prato {

	private final double maxCalorias;
	
	public PratoDieta(String nome, double maxCalorias) {
		super(nome);
		this.maxCalorias = maxCalorias;
	}
	
	public double getMaxCalorias() {
		return maxCalorias;
	}
	
	@Override
	public boolean addIngrediente(Alimento alimento) {	
		if(alimento == null) {
			return false;
		}
		if(alimento.getCalorias() + super.getTotalCalorias() <= getMaxCalorias()) {
			super.addIngrediente(alimento);
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(maxCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PratoDieta other = (PratoDieta) obj;
		if (Double.doubleToLongBits(maxCalorias) != Double.doubleToLongBits(other.maxCalorias))
			return false;
		return true;
	}
	
	
}
