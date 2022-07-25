package coffeeShop.abstracts;

import coffeeShop.entity.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to database"+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
