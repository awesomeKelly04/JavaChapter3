package computerizationOfHealthRecords;

import targetHeartRateCalculator.DateOfBirth;
import targetHeartRateCalculator.HeartRates;

public class HealthProfile extends HeartRates {
	private double height; 
	private double weight;
	
	public HealthProfile(String firstName, String lastName, DateOfBirth dateOfBirth, double height, double weight) {
		super(firstName, lastName, dateOfBirth);
		this.height = height;
		this.weight = weight;
	}
		
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double BMI(double weight, double height) {
		return (weight * 703)/(height * height);
	}
}
