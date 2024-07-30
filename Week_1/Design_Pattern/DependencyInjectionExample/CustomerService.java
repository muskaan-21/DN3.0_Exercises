package DependencyInjectionExample;

public class CustomerService  {
	private final CustomerRepository cr;
	public CustomerService(CustomerRepository cr) {
		this.cr=cr;
	}
	public Customer getCustomerById(int id) {
		return cr.findCustomerById(id);
	}

}
