package aula02.exercicio1;
import java.text.*;

public class Data {
	private final int day;
	private final int month;
	private final int year;
	
	public Data(int day, int month, int year){
		if(!isValidDate(year,month,day)) throw new IllegalArgumentException();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int day(){ 
		return day; 
	}
	
	public int month(){
		return month; 
	}
	
	public int year(){ 
		return year; 
	}
	
	public String toString(){
		return String.format("%02d-%02d-%04d", day, month, year);
	}
	
	private static boolean isValidDate(int year, int month, int day){
		
		String inputDate = day+"-"+month+"-"+year;
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