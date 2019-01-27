package org.yaashi.customer.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.yaashi.customer.model.Customer;
import org.yaashi.customer.service.CustomerService;

@Path("/customers")
public class CustomerResource 
{
	/* @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 public String getMessages()
	 {
		 return "Hello World";
	 }*/
	CustomerService cs=new CustomerService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomer()
	{
		return cs.getAllCustomers();
	}
	
	@GET
	@Path("/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("customerId")long customerId)
	{
		return cs.getCustomer(customerId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Customer addCustomer(Customer customer)
	{
		return cs.addCustomer(customer);
	}
	
	
	@PUT
	@Path("/{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Customer updateCustomer(@PathParam("customerId")long id,Customer customer)
	{
		customer.setId(id);
		return cs.updateCustomer(customer);
	}

	@DELETE
	@Path("/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCustomer(@PathParam("customerId")long id)
	{
		cs.removeCustomer(id);
	}
}
