package coffeeShop.concretes;

import java.rmi.RemoteException;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entity.Customer;



public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;

	
	
	public StarbucksCustomerManager() {
	}

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Save to db : " + customer.getFirstName());

        } else {
            System.out.println("Not a valid person");
		}
	}
	

}
