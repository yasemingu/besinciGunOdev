package besinciGunOdev.core;

import besinciGunOdev.entities.concretes.Customer;

public class SendEmail implements SendVerificationEmail{

	@Override
	public void verification(Customer customer) {
		System.out.println("Doðrulama maili gönderildi");
	
	}


	
	
}
