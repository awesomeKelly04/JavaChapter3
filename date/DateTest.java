package date;

import javax.swing.JOptionPane;

import targetHeartRateCalculator.DateOfBirth;

public class DateTest {
	
	private static DateOfBirth dateOfBirth;

	public static void main(String[] args) {
		dateOfBirth = new DateOfBirth (0, 0, 0);
		String regexInteger = "^-?\\d+$";
		
		for ( ; ; ) {
			String setMonth = JOptionPane.showInputDialog("Enter the integer value of your month of birth?");			
			
			if (setMonth.matches(regexInteger)) {
				dateOfBirth.setMonth(Integer.parseInt(setMonth));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \nPlease, only enter the integer value of your month of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setDay = JOptionPane.showInputDialog("Enter the integer value of your day of birth?");			
			
			if (setDay.matches(regexInteger)) {
				dateOfBirth.setDay(Integer.parseInt(setDay));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \nPlease, only enter the integer value of your day of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setYear = JOptionPane.showInputDialog("Enter the integer value of your year of birth?");			
			
			if (setYear.matches(regexInteger)) {
				dateOfBirth.setYear(Integer.parseInt(setYear));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \nPlease, only enter the integer value of your year of birth.");
			} 
		}
   
		JOptionPane.showMessageDialog(null, dateOfBirth.displayDate(dateOfBirth.getMonth(), 
				dateOfBirth.getDay(), dateOfBirth.getYear()));

	}

}
