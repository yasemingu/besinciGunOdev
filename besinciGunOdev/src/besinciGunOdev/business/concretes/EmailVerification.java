package besinciGunOdev.business.concretes;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import besinciGunOdev.core.Verification;
import besinciGunOdev.entities.concretes.Customer;

public class EmailVerification implements Verification {

	
	String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	
	
	
	@Override
	public boolean verification(Customer customer) {
		
				Matcher matcher = pattern.matcher(customer.geteMail());
		if(matcher.matches()) {
			return true;
		}

		else {
			System.out.println("Email doðru girilmedi.");
			return false;
		}
		

	}
	}
	

