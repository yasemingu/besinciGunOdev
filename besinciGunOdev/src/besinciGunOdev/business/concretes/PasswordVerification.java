package besinciGunOdev.business.concretes;

import besinciGunOdev.core.Verification;
import besinciGunOdev.entities.concretes.Customer;

public class PasswordVerification implements Verification{


	@Override
	public boolean verification(Customer customer) {
		if(!customer.getPassword().isEmpty() && (customer.getPassword().length()>=6)) {
			
			return true;
			
		}

		else {
			System.out.println("Şifre en az 6 karakterden oluşmalıdır.");
			return false;
	}

}
}