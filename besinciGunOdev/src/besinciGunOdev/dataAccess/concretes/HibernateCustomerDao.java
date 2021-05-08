package besinciGunOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import besinciGunOdev.dataAccess.abstracts.CustomerDao;
import besinciGunOdev.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers = new ArrayList<>();

	@Override
	public void add(Customer customer) {
		System.out.println("Kullan�c� eklendi: " + customer.getFirstName());

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� g�ncellendi: " + customer.getFirstName());

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� silindi: " + customer.getFirstName());

	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sameEmailCheck(Customer customer, String eMail) {

		for (Customer customer2 : customers)
			if (customer2.geteMail() == customer.geteMail()) {
				System.out.println("Bu email daha �nce kullan�lm��");
				return false;
			}

		return true;
	}

	@Override
	public boolean signInCheck(String eMail, String password, Customer customer) {
		if(eMail == customer.geteMail() && password == customer.getPassword()) {
			System.out.println("Ba�ar�yla giri� yap�ld�");
			return true;
		} else {
			System.out.println(" Giri� yap�lamad�.L�tfen kullan�c� ad� ve mail adresinizi kontrol ediniz.");
			return false;
		}
	}



}
