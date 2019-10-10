package practiceClass;

import java.util.Date;

public class Human {
	private Date dateOfBirth;
	

	public Human() {
		dateOfBirth = null;
	}

	
	public Human(Date date) {
		dateOfBirth = date;
	}

	
	public Date getDateOFBirth() {
		return dateOfBirth;
	}

	public void setDateOFBirth(Date dateOFBirth) {
		this.dateOfBirth = dateOFBirth;
	}

}
