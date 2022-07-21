package classesWithAttributes;

public class Product {
	//attribute-field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;	
	private String kod;	
	
	public Product(int id,String name, String description, double price, int stockAmount) 
	{
		//sadece ve sadece bu parametreler olursa çalýþtýr demek
	System.out.println("Yapýcý Blok Çalýþtý");
	
	this.id=id;
	this.name=name;
	this.description=description;
	this.price =price;
	this.stockAmount=stockAmount;
	
	}
	
	public Product() {}
	
	
	public String getKod() {
		return this.name.substring(0, 1)+id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
}
