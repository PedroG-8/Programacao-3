package aula03.exercicio1;
import java.time.LocalDate;
import java.time.format.*;
import java.text.*;

public class Data {

	private final int dia;
	private final int mes;
	private final int ano;
	
	public Data() {
		String[] dataDeHoje = dataAtual().split("-");
		this.dia = Integer.parseInt(dataDeHoje[0]);
		this.mes = Integer.parseInt(dataDeHoje[1]);
		this.ano = Integer.parseInt(dataDeHoje[2]);
	}
	
	public Data(int dia, int mes, int ano) {
		if(!dataValida(ano, mes, dia)) throw new IllegalArgumentException();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int dia() {
		return this.dia;
	}
	
	public int mes() {
		return this.mes;
	}
	
	public int ano() {
		return this.ano;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	private static String dataAtual() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());
	}
	
	private static boolean dataValida(int ano, int mes, int dia){
		String inputDate = dia+"-"+mes+"-"+ano;
		try {
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			formatter.setLenient(false);
			formatter.parse(inputDate);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	
	
}
