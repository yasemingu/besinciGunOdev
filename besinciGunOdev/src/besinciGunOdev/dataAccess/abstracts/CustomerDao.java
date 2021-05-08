package besinciGunOdev.dataAccess.abstracts;

import java.util.List;

import besinciGunOdev.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);
	
	boolean sameEmailCheck(Customer customer, String eMail);
	
	boolean signInCheck(String eMail, String password, Customer customer);
	
	List<Customer> getAll();

}
