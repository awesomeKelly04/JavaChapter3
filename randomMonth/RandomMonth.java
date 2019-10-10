package randomMonth;

public class RandomMonth {
	private int monthNumber;

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
	}
	
	public String monthName(int monthNumber) {
		String monthName = "";
		if(monthNumber == 1) {
			monthName = "January";
		}
		if(monthNumber == 2) {
			monthName = "February";
		}
		if(monthNumber == 3) {
			monthName = "March";
		}
		if(monthNumber == 4) {
			monthName = "April";
		}
		if(monthNumber == 5) {
			monthName = "May";
		}
		if(monthNumber == 6) {
			monthName = "June";
		}
		if(monthNumber == 7) {
			monthName = "July";
		}
		if(monthNumber == 8) {
			monthName = "August";
		}
		if(monthNumber == 9) {
			monthName = "September";
		}
		if(monthNumber == 10) {
			monthName = "October";
		}
		if(monthNumber == 11) {
			monthName = "November";
		}
		if(monthNumber == 12) {
			monthName = "December";
		}
		return monthName;
	}

}
