package org.yaashi.customer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yaashi.customer.database.DatabaseClass;
import org.yaashi.customer.model.Customer;

public class CustomerService
{
	private Map<Long,Customer> customers=DatabaseClass.getCustomer();
	
	public CustomerService()
	{
		customers.put(1L,new Customer("Yaashi","Hinjewadi phase 1",22));
		customers.put(2L,new Customer("Mahima","Wakad",23));
		
	}
	
	public List<Customer>  getAllCustomers()
	{
		return new ArrayList<Customer>(customers.values());	
	}
	
	public Customer getCustomer(long id)
	{
		return customers.get(id);
	}
	
	public Customer addCustomer(Customer customer)
	{
		customer.setId(customers.size()+1);
		customers.put(customer.getId(),customer);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer)
	{
		if(customer.getId()<=0)
		{
			return null;
		}
		customers.put(customer.getId(),customer);
		return customer;
	}
	
	public Customer removeCustomer(long id)
	{
		return customers.remove(id);
	}
	


}
