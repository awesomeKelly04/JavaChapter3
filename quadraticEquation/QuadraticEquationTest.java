package quadraticEquation;

import java.util.Scanner;

public class QuadraticEquationTest {

	private static Scanner input;
	private static QuadraticEquation equation;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		equation = new QuadraticEquation();
		
		System.out.println("A program that calculates the root of a Quadratic Equation!");
		System.out.println("\t\tax^2 + bx + c = 0");
		System.out.println("***********************************************************");
		
		System.out.print("Enter the value for a: ");
		double a = input.nextDouble();
		equation.setA(a);
		System.out.print("Enter the value for b: ");
		double b = input.nextDouble();
		equation.setB(b);
		System.out.print("Enter the value for c: ");
		double c = input.nextDouble();
		equation.setC(c);
		
		boolean undefinedNature = equation.checkUndefinedNature(equation.getA());
		
		if (undefinedNature == true) {
			System.out.println("\nThe Quadratic Equation is undefined!");
		}
		
		int typeOfDiscriminant = 2;
		if (undefinedNature == false) {
			double discriminant = equation.calculateDiscriminant(equation.getA(), equation.getB(), equation.getC());
			equation.setDiscriminant(discriminant);
			typeOfDiscriminant = equation.checkTypeOfDiscriminant(equation.getDiscriminant());	
		}
		
		if(typeOfDiscriminant == 1) {
			double discriminant = equation.getDiscriminant();
			double root1 = equation.firstRoot(equation.getA(), equation.getB(), discriminant);
			double root2 = equation.secondRoot(equation.getA(), equation.getB(), discriminant);
			System.out.printf("%nThe equation has two real roots %.1f and %.1f%n", root1, root2);
		}
		
		if(typeOfDiscriminant == 0) {
			double root = equation.oneRoot(equation.getA(), equation.getB());
			System.out.printf("%nThe equation has one root %.1f%n", root);
		}
		
		if(typeOfDiscriminant == -1) {
			double discriminant = equation.getDiscriminant() * -1;
			double root = equation.oneRoot(equation.getA(), equation.getB());
			double complexPart = equation.ComplexRootPart(equation.getA(), discriminant);
			System.out.printf("%nThe equation has no real roots %.1f+%.1fi and %.1f-%.1fi%n", root, complexPart, root, complexPart);
		}
		
	}

}
