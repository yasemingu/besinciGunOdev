package besinciGunOdev.business.abstracts;

import java.util.List;

import besinciGunOdev.business.concretes.EmailVerification;
import besinciGunOdev.business.concretes.NameVerification;
import besinciGunOdev.business.concretes.PasswordVerification;
import besinciGunOdev.business.concretes.RequiredFieldsVerification;
import besinciGunOdev.entities.concretes.Customer;

public interface CustomerService {

	void signUp(Customer customer, EmailVerification emailVerification, 
			PasswordVerification passwordVerification, RequiredFieldsVerification fieldsVerification,
			NameVerification nameVerification);
	
	void isMailVerif(Customer customer);
	
	
	
	List<Customer> getAll();

}
