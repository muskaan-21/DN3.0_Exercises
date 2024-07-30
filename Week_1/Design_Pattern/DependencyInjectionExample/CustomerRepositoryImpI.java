package DependencyInjectionExample;

public class CustomerRepositoryImpI implements CustomerRepository {
	public Customer findCustomerById(int id) {
		return new Customer(id," Customer "+id);
	}

	
	

}
