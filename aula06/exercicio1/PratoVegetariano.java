package aula06.exercicio1;

public class PratoVegetariano extends Prato implements AlimentoVegetariano {
	
	public PratoVegetariano(String nome) {
		super(nome);
	}
	
	@Override
	public boolean addIngrediente(Alimento alimento) {
		if(alimento == null) return false;
		if(alimento instanceof AlimentoVegetariano) {
			return super.addIngrediente(alimento);
		}
		return false;
	}
}
