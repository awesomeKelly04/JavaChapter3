package gameAddThreeNumbersGUI;

import javax.swing.JOptionPane;

public class GameAddThreeNumberGUI {

	public static void main(String[] args) {
		int valueA = (int)(System.currentTimeMillis() % 10);		
		int valueB = (int)(System.currentTimeMillis() / 3 % 10);
		int valueC = (int)(System.currentTimeMillis() * 4 % 10);
		int sum =  valueA + valueB + valueC;
				
		int answer = Integer.parseInt(JOptionPane.showInputDialog(String.format("             A Game to add Three Numbers        %n "
				+ "**************************************************%n%n                          %d %d %d        %n"
				+ "%nInput the sum of the above numbers: ", valueA, valueB, valueC)));
		
		if (sum == answer) {
			String ifEqual = String.format("%nAwesome! you’re right... %nThe sum of %d + %d + %d = %d%n", valueA, valueB, valueC, sum);
			JOptionPane.showMessageDialog(null, ifEqual);
		}

		if (sum != answer) {
			String ifNotEqual = String.format("%nOops! Wrong answer...%nThe sum of %d + %d + %d = %d%n", valueA, valueB, valueC, sum);
			JOptionPane.showMessageDialog(null, ifNotEqual);
		}
	}
}
