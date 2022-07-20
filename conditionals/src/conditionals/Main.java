package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 24 ;
		if(sayi<20) {
			System.out.println("Sayý 20'den küçüktür.");
		}
		else if(sayi>20){
			System.out.println("Sayý 20'den büyüktür.");
		}else {
			System.out.println("Sayý 20'ye eþittir.");
		}
		
//tüm þartlara karþýlýk veren -> defensive programming 
	}

}
