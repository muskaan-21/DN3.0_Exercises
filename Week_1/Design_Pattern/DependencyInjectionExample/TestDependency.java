package DependencyInjectionExample;

public class TestDependency {

	public static void main(String[] args) {
		CustomerRepository cr=new CustomerRepositoryImpI();
		CustomerService cs=new CustomerService(cr);
		Customer cust=cs.getCustomerById(1);
		System.out.println(cust);

	}

}
