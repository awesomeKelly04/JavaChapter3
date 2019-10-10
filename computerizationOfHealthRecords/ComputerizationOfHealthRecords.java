package computerizationOfHealthRecords;

import javax.swing.JOptionPane;

public class ComputerizationOfHealthRecords {
	
	private static HealthProfile healthProfile;
	private static int years;
	private static double BMI;
	private static int maximumHeartRate; 
	private static String targetHeartRate;

	public static void main(String[] args) {
		healthProfile = new HealthProfile(null, null, null, 0.0, 0.0);
		String regexDecimal = "^-?\\d*\\.\\d+$";
		String regexInteger = "^-?\\d+$";
		String regexDouble =  regexDecimal + "|" + regexInteger;

		for ( ; ; ) {
			String setFirstName = JOptionPane.showInputDialog("Enter your first name?");			
			
			if (!(setFirstName.isEmpty())) {
				healthProfile.setFirstName(setFirstName);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! first name is required... \nPlease, enter your first name.");
			} 
		}
		
		for ( ; ; ) {
			String setLastName = JOptionPane.showInputDialog("Enter your last name?");			
			
			if (!(setLastName.isEmpty())) {
				healthProfile.setLastName(setLastName);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! last name is required... \nPlease, enter your last name.");
			} 
		}
		
		for ( ; ; ) {
			String setMonth = JOptionPane.showInputDialog("Enter the integer value of your month of birth?");			
			
			if (setMonth.matches(regexInteger)) {
				healthProfile.dateOfBirth.setMonth(Integer.parseInt(setMonth));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \n"
						+ "Please, only enter the integer value of your month of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setDay = JOptionPane.showInputDialog("Enter the integer value of your day of birth?");			
			
			if (setDay.matches(regexInteger)) {
				healthProfile.dateOfBirth.setDay(Integer.parseInt(setDay));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \n"
						+ "Please, only enter the integer value of your day of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setYear = JOptionPane.showInputDialog("Enter the integer value of your year of birth?");			
			
			if (setYear.matches(regexInteger)) {
				healthProfile.dateOfBirth.setYear(Integer.parseInt(setYear));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \n"
						+ "Please, only enter the integer value of your year of birth.");
			} 
		}
		
		for ( ; ; ) {
			String setWeight = JOptionPane.showInputDialog("Enter your weight (in pounds)?");			
			
			if (setWeight.matches(regexDouble)) {
				healthProfile.setWeight(Double.valueOf(setWeight));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! \nPlease, only enter the value of your weight (in pounds).");
			} 
		}
		
		for ( ; ; ) {
			String setHeight = JOptionPane.showInputDialog("Enter your height (in inches)?");			
			
			if (setHeight.matches(regexDouble)) {
				healthProfile.setHeight(Double.valueOf(setHeight));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! \nPlease, only enter the value of your height (in inches).");
			} 
		}
				
		years = healthProfile.dateOfBirth.getAge();
		BMI = healthProfile.BMI(healthProfile.getWeight(), healthProfile.getHeight());
		maximumHeartRate = healthProfile.maximumHeartRate(years);
		targetHeartRate = healthProfile.targetHeartRate(maximumHeartRate);
		
		String message =                                             
		   String.format("Name: %s %s%n"
		   		+ "Date of birth: %d/%d/%d%n"
		   		+ "Age: %dyears%n"
		   		+ "Body Mass Index is %.1f%n"
		   		+ "Maximum heart rate is %d%n"
		   		+ "Target heart rate range is %s%n%n"
		   		+ "BMI VALUES%n"
		   		+ "Underweight: less than %.1f%n"
		   		+ "Normal: between %.1f and %.1f%n"
		   		+ "Overweight: between %d and %.1f%n"
		   		+ "Obese: %d or greater%n", 
				   healthProfile.getFirstName(), healthProfile.getLastName(), 
				   healthProfile.dateOfBirth.getMonth(), healthProfile.dateOfBirth.getDay(), 
				   healthProfile.dateOfBirth.getYear(), years, BMI, maximumHeartRate, targetHeartRate, 
				   18.5, 18.5, 24.9, 25, 29.9, 30);
		      
		JOptionPane.showMessageDialog(null, message);
	}
}
