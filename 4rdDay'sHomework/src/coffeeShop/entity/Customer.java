package coffeeShop.entity;

import coffeeShop.abstracts.Entity;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String nationalityId;
	
	
	
	
	
	public Customer() {
		super();
	}
	
	
	
	public Customer(int id, String firstName, String lastName, int birthOfYear, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.nationalityId = nationalityId;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
