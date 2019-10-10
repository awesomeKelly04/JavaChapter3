package employee3_13;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Rex", "Charles", 100.00);
		Employee employee2 = new Employee("John", "James", 2000.00);		

		displayEmployeeDetails(employee1);
		displayEmployeeDetails(employee2);
	}
	
	public static void displayEmployeeDetails(Employee employeeToDisplay) {
		double yearlySalary = employeeToDisplay.getYearlySalary(employeeToDisplay.getMonthlySalary());
		double yearlySalaryWithRaise = employeeToDisplay.getYearlySalaryWithRaise(yearlySalary);
		
		 System.out.printf("%s %s's yearly salary $%.2f%n"
		 		+ "With 10 percent bonus of %.2f%n"
		 		+ "You have %.2f%n%n", 
				 employeeToDisplay.getFirstName(), employeeToDisplay.getLastName(), 
				yearlySalary,  yearlySalary *  0.1, 	yearlySalaryWithRaise); 
	}

}
