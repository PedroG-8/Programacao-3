package aula10.exercicio1;
import java.time.LocalDate;
import java.text.*;
import java.time.format.DateTimeFormatter;

public class Data 
{
	private final int dia;
	private final int mes;
	private final int ano;
	private static Data today = new Data();
	
	public Data() 
	{
		String[] dataAtual = currentDate().split("-");
		this.dia = Integer.parseInt(dataAtual[0]);
		this.mes = Integer.parseInt(dataAtual[1]);
		this.ano = Integer.parseInt(dataAtual[2]);
	}
	
	public Data(int d, int m, int a)
	{
		if(!isValidDate(a,m,d)) throw new IllegalArgumentException("Data invalida");
		dia = d;
		mes = m;
		ano = a;
	}
	
	public int dia()
	{ 
		return dia;
	}
	public int mes()
	{
		return mes; 
	}
	public int ano()
	{ 
		return ano; 
	}
	public String toString() 
	{
		return toString("/");
	}
	public String toString(String mid)
	{
		return String.format("%02d%s%02d%s%04d", dia, mid, mes, mid, ano);
	}
	
	private static String currentDate()
	{
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());
	}
	
	// Verifica se a data é válilda
	private static boolean isValidDate(int ano, int mes, int dia)
	{
		String inputDate = dia+"-"+mes+"-"+ano;
		try 
		{
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			formatter.setLenient(false);
			formatter.parse(inputDate);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static Data today() 
	{
		return today;
	}
	
}