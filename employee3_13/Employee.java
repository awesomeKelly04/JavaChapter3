package employee3_13;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary > 0.0) {
			this.monthlySalary = monthlySalary;
		}
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public double getYearlySalary(double monthlySalary) {
		return monthlySalary * 12;
	}
	
	public double getYearlySalaryWithRaise(double monthlySalary) {
		double raise = monthlySalary * 10 / 100;
		return monthlySalary + raise;
	}
}


