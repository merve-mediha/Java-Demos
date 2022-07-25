package coffeeShop.abstracts;

import coffeeShop.entity.Customer;

public interface CustomerService {
	void save(Customer customer) throws Exception;
}
