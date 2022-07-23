package oop2;

public class CustomerManager {
	public CustomerManager() {
		System.out.println("Construct. çalýþtý");
	}
	
	public void add(Customer customer) {
		System.out.println("Customer added");
//		DatabaseLogger databaseLogger = new DatabaseLogger();
//		databaseLogger.log(customer.getFirstName());
	}
	
	public void update(Customer customer) {
		System.out.println("Customer updated");
//		CloudLogger cloudLogger = new CloudLogger();
//		cloudLogger.log(customer.getFirstName());
		
	}

}
