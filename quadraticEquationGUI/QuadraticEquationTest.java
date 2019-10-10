package quadraticEquationGUI;

import javax.swing.JOptionPane;

import quadraticEquation.QuadraticEquation;

public class QuadraticEquationTest {
	private static QuadraticEquation equation;

	public static void main(String[] args) {
		equation = new QuadraticEquation();
		
		JOptionPane.showMessageDialog(null, ""
				+ "A program that calculates the root of a Quadratic Equation!"
				+ "\n\t\tax^2 + bx + c = 0"
				+ "\n******************************************************************");
				
		equation.setA(Double.valueOf(JOptionPane.showInputDialog("Enter the value for a: ")));
		
		equation.setB(Double.valueOf(JOptionPane.showInputDialog("Enter the value for b: ")));
		
		equation.setC(Double.valueOf(JOptionPane.showInputDialog("Enter the value for c: ")));
				
		if (equation.checkUndefinedNature(equation.getA()) == true) {
			JOptionPane.showMessageDialog(null, "\nThe Quadratic Equation is undefined!");			
		}
		
		if (equation.checkUndefinedNature(equation.getA()) == false) {
			equation.setDiscriminant(equation.calculateDiscriminant(
					equation.getA(), equation.getB(), equation.getC()));
		}
		
		if(equation.checkTypeOfDiscriminant(equation.getDiscriminant()) == 1) {
			
			String message = String.format("%nThe equation has two real roots %.1f and %.1f%n", 
					equation.firstRoot(equation.getA(), equation.getB(), equation.getDiscriminant()), 
					equation.secondRoot(equation.getA(), equation.getB(), equation.getDiscriminant()));
			
			JOptionPane.showMessageDialog(null, message);				
		}
		
		if(equation.checkTypeOfDiscriminant(equation.getDiscriminant()) == 0) {
			
			String message = String.format("%nThe equation has one root %.1f%n", 
					equation.oneRoot(equation.getA(), equation.getB()));
			
			JOptionPane.showMessageDialog(null, message);
		}
		
		if(equation.checkTypeOfDiscriminant(equation.getDiscriminant()) == -1) {
			
			String message = String.format("%nThe equation has no real roots "
					+ "%.1f+%.1fi and %.1f-%.1fi%n", 
					equation.oneRoot(equation.getA(), equation.getB()), 
					equation.ComplexRootPart(equation.getA(), equation.getDiscriminant() * -1), 
					equation.oneRoot(equation.getA(), equation.getB()), 
					equation.ComplexRootPart(equation.getA(), equation.getDiscriminant() * -1));
			
			JOptionPane.showMessageDialog(null, message);	
		}
	}
}

