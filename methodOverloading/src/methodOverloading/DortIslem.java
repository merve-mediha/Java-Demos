package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
		
	}
	
	//ayn� metod olsa da parametreleri farkl� 
	//bu �ekilde ayn� metodu kullan�rsak bu metod Overloading olur.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2;
		
	}
	
	
}
