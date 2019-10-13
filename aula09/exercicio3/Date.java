package aula09.exercicio3;

public class Date {

	public int day;
	public int month;
	public int year;
	
	public Date (int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public Date() {
		
	}
	
	public int getDay() {
		if(day >= 1 && day <= 31) {
			return this.day;
		} else {
			return 0;
		}
	}
	
	public int getMonth() {
		if(month >= 1 && month <= 12) {
			return this.month;
		} else {
			return 0;
		}
	}

	public int getYear() {
		if(year >= 0 && year <= 2018) {
			return this.year;
		} else {
			return 0;
		}
	}

}
