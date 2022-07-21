package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",7000,3);
		
		Product product1 = new Product(); //böyle de kullanmak istersem ayný zamanda, parametresiz constructor oluþturmalýyým

		product1.setName("Laptop");
		product1.setId(1); 
		product1.setDescription("Asus Laptop");
		product1.setPrice(7000);
		product1.setStockAmount(3);
		product1.getKod();
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		 productManager.add2(1, "", "", 1000, 3);

		 System.out.println(product.getKod());
	}

}
