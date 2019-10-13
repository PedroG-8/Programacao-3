package aula06.exercicio1;

public enum DiaSemana {
	
	Domingo(0), Segunda(1), Terça(2), Quarta(3), Quinta(4), Sexta(5), Sabado(6);
	
	private int index;

	private DiaSemana(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	public static DiaSemana getDia(int n) {
		DiaSemana dia = null;
		for(DiaSemana ds : DiaSemana.values()) {
			if(n == ds.getIndex()) {
				dia = ds;
			}
		}
		return dia;
	}
	
	public static DiaSemana rand() {
		DiaSemana dia = null;
		int rand = (int)(Math.random() * 6);
		for(DiaSemana ds : DiaSemana.values()) {
			if(rand == ds.getIndex()) {
				dia = ds;
			}
		}
		return dia;
	}
	
}
