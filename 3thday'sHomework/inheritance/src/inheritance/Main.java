package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.email="";
		employee.salary =10000;
		
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		employeeManager.BestEmployee();

	}

}
