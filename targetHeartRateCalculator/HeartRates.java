package targetHeartRateCalculator;

public class HeartRates {
	
	private String firstName;
	private String lastName;
	public DateOfBirth dateOfBirth;
	
	public HeartRates(String firstName, String lastName, DateOfBirth dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = new DateOfBirth(0, 0, 0);
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
	
	public int maximumHeartRate(int year) {
		return 220 - year;
	}
	
	public String targetHeartRate (double maximumHeartRate) {
		return String.format("%.0f - %.0f", (50 * maximumHeartRate)/100, (85 * maximumHeartRate)/100);
	}
	
	

}
