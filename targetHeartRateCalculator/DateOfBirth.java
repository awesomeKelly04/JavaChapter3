package targetHeartRateCalculator;

import java.util.Calendar;

public class DateOfBirth {
	private int month;
	private int day;
	private int year;
	
	public DateOfBirth(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR) - year;
	}

	public String displayDate (int month, int day, int year) {
		String message = String.format("Your Date of birth is %d/%d/%d%n", month, day, year);
		return message;
	}
}
