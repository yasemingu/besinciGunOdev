package besinciGunOdev;

import besinciGunOdev.business.abstracts.CustomerService;
import besinciGunOdev.business.concretes.CustomerManager;
import besinciGunOdev.business.concretes.EmailVerification;
import besinciGunOdev.business.concretes.NameVerification;
import besinciGunOdev.business.concretes.PasswordVerification;
import besinciGunOdev.business.concretes.RequiredFieldsVerification;
import besinciGunOdev.core.GoogleLogin;
import besinciGunOdev.core.SendEmail;
import besinciGunOdev.core.loginWithDifferentServices;
import besinciGunOdev.dataAccess.abstracts.CustomerDao;
import besinciGunOdev.dataAccess.concretes.HibernateCustomerDao;
import besinciGunOdev.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {

		RequiredFieldsVerification fieldsVerification = new RequiredFieldsVerification();
		PasswordVerification passwordVerification = new PasswordVerification();
		NameVerification nameVerification = new NameVerification();
		EmailVerification emailVerification = new EmailVerification();

		CustomerDao customerDao = new HibernateCustomerDao();
		CustomerService customerService = new CustomerManager(new SendEmail());
		HibernateCustomerDao hibernateCustomerDao = new HibernateCustomerDao();
		Customer customer = new Customer(1, "Yasemin", "Günel", "yasemingunel@gmail.com", "Þifre1234");
		
		customerDao.add(customer);
		customerDao.delete(customer);
		customerDao.update(customer);

		System.out.println("--------------------------");

		
		customerService.signUp(customer, emailVerification, passwordVerification, fieldsVerification, nameVerification);


		System.out.println("--------------------------");

		hibernateCustomerDao.signInCheck("yasemingunelgmail.com", "Þifre1234", customer);
		

		System.out.println("--------------------------");
		
		hibernateCustomerDao.sameEmailCheck(customer, "yasemingunel@gmail.com");
			
		customerService.isMailVerif(customer);
		
		loginWithDifferentServices differentServices = new GoogleLogin();
		
		System.out.println("--------------------------");

		differentServices.loginWith(null);
	
	}
	

}
