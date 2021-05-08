package besinciGunOdev.business.concretes;


import besinciGunOdev.core.Verification;
import besinciGunOdev.entities.concretes.Customer;

public class NameVerification implements Verification{

	
	@Override
	public boolean verification(Customer customer) {
		
		if(customer.getFirstName().length()>1 && customer.getLastName().length()>1) {
			return true;
		
			
		}
		
		else {
		System.out.println("Ad ve Soyad en az iki karakterden oluşmalıdır.");
		return false;
	}
		
	}}
	
	
	

