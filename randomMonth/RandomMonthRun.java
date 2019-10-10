package randomMonth;

import javax.swing.JOptionPane;

public class RandomMonthRun {

	private static RandomMonth randomMonth;

	public static void main(String[] args) {
		randomMonth = new RandomMonth();

		randomMonth.setMonthNumber((int) Math.floor(Math.random() * 13));
		
		String message = String.format("A program that randomly generate the integer value of the monthn%n"
				+ "and assign and print it's name%n"
				+ "%n******************************************************************"
				+ "%n%nThe Month generated is %d%n and the month name is %s%n", 
				randomMonth.getMonthNumber(), randomMonth.monthName(randomMonth.getMonthNumber()));
		
		JOptionPane.showMessageDialog(null, message);	
	}

}
