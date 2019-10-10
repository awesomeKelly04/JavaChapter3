package practiceClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HumanTest {

	public static void main(String[] args) {		
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
		Human human = new Human(new Date());
		System.out.printf("%nDate of Birth is %s%n", dateFormat.format(human.getDateOFBirth()));
		
		human.setDateOFBirth(new Date());		
		System.out.printf("%nDate of Birth is %s%n", dateFormat.format(human.getDateOFBirth()));
		
		dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		Calendar cal = Calendar.getInstance();
		human.setDateOFBirth(cal.getTime());
		System.out.printf("%nDate of Birth is %s%n", dateFormat.format(human.getDateOFBirth()));
		
	}

} 
