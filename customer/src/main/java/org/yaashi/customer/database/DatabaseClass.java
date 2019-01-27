package org.yaashi.customer.database;

import java.util.HashMap;
import java.util.Map;

import org.yaashi.customer.model.Customer;

public class DatabaseClass 
{
	public static Map<Long,Customer> customers=new HashMap<>();
	
	public static Map<Long,Customer> getCustomer()
	{
		return customers;
		
	}

}
