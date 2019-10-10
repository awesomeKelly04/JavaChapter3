package targetHeartRateCalculator;

import javax.swing.JOptionPane;

public class TargetHeartRateCalculator {

	private static HeartRates heartRate;
	private static int years;
	private static int maximumHeartRate; 
	private static String targetHeartRate;
	

	public static void main(String[] args) {
		heartRate = new HeartRates(null, null, null);

		for ( ; ; ) {
			String setFirstName = JOptionPane.showInputDialog("Enter your first name?");			
			
			if (!(setFirstName.isEmpty())) {
				heartRate.setFirstName(setFirstName);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! first name is required... \nPlease, enter your first name.");
			} 
		}
		
		for ( ; ; ) {
			String setLastName = JOptionPane.showInputDialog("Enter your last name?");			
			
			if (!(setLastName.isEmpty())) {
				heartRate.setLastName(setLastName);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! last name is required... \nPlease, enter your last name.");
			} 
		}
		
		for ( ; ; ) {
			String setMonth = JOptionPane.showInputDialog("Enter the integer value of your month of birth?");			
			
			if (setMonth.matches("\\d+")) {
				heartRate.dateOfBirth.setMonth(Integer.parseInt(setMonth));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \nPlease, only enter the integer value of your month of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setDay = JOptionPane.showInputDialog("Enter the integer value of your day of birth?");			
			
			if (setDay.matches("\\d+")) {
				heartRate.dateOfBirth.setDay(Integer.parseInt(setDay));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \nPlease, only enter the integer value of your day of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setYear = JOptionPane.showInputDialog("Enter the integer value of your year of birth?");			
			
			if (setYear.matches("\\d+")) {
				heartRate.dateOfBirth.setYear(Integer.parseInt(setYear));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \nPlease, only enter the integer value of your year of birth.");
			} 
		}
		
		years = heartRate.dateOfBirth.getAge();
		maximumHeartRate = heartRate.maximumHeartRate(years);
		targetHeartRate = heartRate.targetHeartRate(maximumHeartRate);
		
		String message =                                             
		   String.format("Name: %s %s%n"
		   		+ "Date of birth: %d/%d/%d%n"
		   		+ "Age: %dyears%n"
		   		+ "Maximum heart rate is %d%n"
		   		+ "Target heart rate range is %s%n", 
				   heartRate.getFirstName(), heartRate.getLastName(), 
				   heartRate.dateOfBirth.getMonth(), heartRate.dateOfBirth.getDay(), 
				   heartRate.dateOfBirth.getYear(), years, maximumHeartRate, targetHeartRate);
		      
		JOptionPane.showMessageDialog(null, message);		
	}
}
