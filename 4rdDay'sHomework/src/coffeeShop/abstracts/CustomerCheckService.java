package coffeeShop.abstracts;

import java.rmi.RemoteException;

import coffeeShop.entity.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
