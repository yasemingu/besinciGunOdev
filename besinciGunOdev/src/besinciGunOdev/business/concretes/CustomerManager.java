package besinciGunOdev.business.concretes;

import java.util.List;

import besinciGunOdev.business.abstracts.CustomerService;
import besinciGunOdev.core.SendEmail;
import besinciGunOdev.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	
	private SendEmail sendEmail;
	
	
	

	public CustomerManager(SendEmail sendEmail) {
		super();
		this.sendEmail = sendEmail;
	}

	@Override
	public void signUp(Customer customer, EmailVerification emailVerification,
			PasswordVerification passwordVerification, RequiredFieldsVerification fieldsVerification, 
			NameVerification nameVerification) {
		
		if(emailVerification.verification(customer) && passwordVerification.verification(customer) && 
				nameVerification.verification(customer) &&
				fieldsVerification.verification(customer)) {
			
			this.sendEmail.verification(customer);
		}
		else {
			System.out.println("Lütfen tüm bilgileri doðru girdiðinizden emin olunuz.");
		}
	}

	

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void isMailVerif(Customer customer) {
		System.out.println(customer.geteMail()+" mail adresi doðrulandý."); 
	}

	}


