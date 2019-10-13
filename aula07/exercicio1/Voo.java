package aula07.exercicio1;

public class Voo {

	private Hora atraso = new Hora(); // Voo não tem atraso
	private final Hora partida;
	private final String nome;
	private final String origem;
	private final Companhia companhia;
	
	public Voo(Hora partida, String nome, Companhia companhia, String origem, Hora atraso) {
		if(partida == null || atraso == null || origem == null || companhia == null) throw new NullPointerException("Null element present");
		this.partida = partida;
		this.atraso = atraso;
		this.nome = nome;
		this.origem = origem;
		this.companhia = companhia;
	}
	
	public int getAtrasoMins() {
		return atraso.getTotalMins();
	}

	public Hora getAtraso() {
		return atraso;
	}

	public Hora getPartida() {
		return partida;
	}

	public String getNome() {
		return nome;
	}

	public String getOrigem() {
		return origem;
	}

	public Companhia getCompanhia() {
		return companhia;
	}

	@Override
	public String toString() {
		return String.format("%s\t%-10s\t%-18s\t%-20s\t%-5s\t%s",  partida.toString(), nome.toString(), companhia.toString(), origem.toString(), 
				Hora.isHoraZero(atraso) ? "" : atraso.toString(), Hora.isHoraZero(atraso) ? "" : "Previsto: "+Hora.getHoraPrevista(partida,atraso).toString());
	}
}
