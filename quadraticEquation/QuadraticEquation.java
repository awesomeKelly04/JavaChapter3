package quadraticEquation;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	private double discriminant;
		
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getDiscriminant() {
		return discriminant;
	}

	public void setDiscriminant(double discriminant) {
		this.discriminant = discriminant;
	}

	public boolean checkUndefinedNature(double a) { 		
		return (a == 0)? true: false;
	}
	
	public double calculateDiscriminant(double a, double b, double c) {
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public int checkTypeOfDiscriminant(double discriminant) {
		int check = 0;		
		
		if (discriminant == 0) {
			check = 0;
		}
		
		if (discriminant > 0) {
			check = 1;
		}
		
		if (discriminant < 0) {
			check = -1;
		}
		
		return check;
	}
	
	public double firstRoot(double a, double b, double discriminant) {
		return (-b + Math.pow(discriminant, 0.5)) / (2 * a);
	}
	
	public double secondRoot(double a, double b, double discriminant) {
		return (-b - Math.pow(discriminant, 0.5)) / (2 * a);
	}
	
	public double oneRoot(double a, double b) {
		return -b / (2 * a);
	}
	
	public double ComplexRootPart(double a, double discriminant) {
		return (Math.pow(discriminant, 0.5)) / (2 * a);
	}

}
