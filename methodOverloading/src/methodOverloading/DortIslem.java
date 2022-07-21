package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
		
	}
	
	//ayný metod olsa da parametreleri farklý 
	//bu þekilde ayný metodu kullanýrsak bu metod Overloading olur.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2;
		
	}
	
	
}
