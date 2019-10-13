package aula07.exercicio1;

public class Hora {
	
	private static final Hora horaZero = new Hora();
	private final int totalMins;
	
	public Hora(int tm) {
		totalMins = tm;
	}
	
	public Hora() {
		this(0,0);
	}
	
	public Hora(String str) {
		this(str, ":");
	}
	
	public Hora(String str, String regex) {
		this(Integer.parseInt(str.split(regex)[0]), Integer.parseInt(str.split(regex)[1]));
	}
	
	public Hora(int hora, int minutos) {
		this((hora * 60) + minutos);
	}
	
	public static boolean isHoraZero(Hora h) {
		return horaZero.equals(h);
	}
	
	public int getHora() {
		return totalMins / 60;
	}
	
	public int getMinutos() {
		return totalMins % 60;
	}
	
	public int getTotalMins() {
		return totalMins;
	}
	
	public static Hora getHoraPrevista(Hora h1, Hora h2) {
		int somaTotalMinutos = h1.getTotalMins() + h2.getTotalMins();
		int newHoras = somaTotalMinutos/60;
		int newMinutos = somaTotalMinutos%60;
		if(newHoras > 23) newHoras = newHoras - 24;
		return new Hora(newHoras, newMinutos);
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d", getHora(), getMinutos());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + totalMins;
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
		Hora other = (Hora) obj;
		if (totalMins != other.totalMins)
			return false;
		return true;
	}
}
