package besinciGunOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import besinciGunOdev.dataAccess.abstracts.CustomerDao;
import besinciGunOdev.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers = new ArrayList<>();

	@Override
	public void add(Customer customer) {
		System.out.println("Kullanýcý eklendi: " + customer.getFirstName());

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanýcý güncellendi: " + customer.getFirstName());

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi: " + customer.getFirstName());

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
				System.out.println("Bu email daha önce kullanýlmýþ");
				return false;
			}

		return true;
	}

	@Override
	public boolean signInCheck(String eMail, String password, Customer customer) {
		if(eMail == customer.geteMail() && password == customer.getPassword()) {
			System.out.println("Baþarýyla giriþ yapýldý");
			return true;
		} else {
			System.out.println(" Giriþ yapýlamadý.Lütfen kullanýcý adý ve mail adresinizi kontrol ediniz.");
			return false;
		}
	}



}
