package co.edureka.dao;

import java.util.List;

import co.edureka.model.Customer;

public interface CustomerDAO {
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int cid);
	List<Customer> getCustomers();
	Customer getCustomer(int cid);
}
