package oop2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//loglama bir sistemdeki aktiviteleri bir yere yazma yöntemi
		//örneðin þu saatte þu dosyayý çaðýrdý
		//loglama veritabanýna metindosyasýna cloud da çoðu ortamda yapýlabilir.
		//bir kere yazýp kullanmak istediðpim her yerde kullanmam lazým.

		
		DatabaseLogger logger = new DatabaseLogger();
		logger.log("ajsdkg");
		
		Customer customer = new Customer(1,"Mediha","Demir","0517269") ;
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		
		System.out.println(customer.getFirstName()+"\t"+customer.getLastName()+"\t");
		
		
	System.out.println("-----------------------------------------------------");
	
		Logger logger1 = new CloudLogger();
		Logger logger2 = new DatabaseLogger();
		Logger logger3 = new ElasticLogger();
		
		ArrayList<Logger> logList = new ArrayList<Logger>();
		logList.add(logger1);
		logList.add(logger2);
		logList.add(logger3);
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Ahmet");
		
		EmployeeManager employeeManager = new EmployeeManager(logList);
		employeeManager.add(employee1);
	}
	
	


}
