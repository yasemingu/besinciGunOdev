package besinciGunOdev.business.concretes;

import besinciGunOdev.core.Verification;
import besinciGunOdev.entities.concretes.Customer;

public class RequiredFieldsVerification implements Verification {
	
@Override
public boolean verification(Customer customer) {
	
	if(customer.getFirstName().isEmpty() && customer.getFirstName().isEmpty() && customer.geteMail().isEmpty() && 
			customer.getPassword().isEmpty()) {
		
	System.out.println("Eksik bilgi girdiniz.");
	return false;
}
	else {
		return true;
	}
	
	
	
	
	
}
	

}
