package coffeeShop;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.adapter.MernisServiceAdapter;

import coffeeShop.concretes.StarbucksCustomerManager;
import coffeeShop.entity.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Mediha Merve","Demiraslan",1997,"221640776878"));

	}

}
