package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 25 ;
		int remainder = number%2;
		System.out.println(remainder);
		
		//1 asal sayı gösterdiği için----defensive programming için
		if(number==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı!");
		}
		
		boolean isPrime = true;
		for(int i = 2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) { //bu şekilde bırakmak ile isPrime==true demek aynıdır.
			System.out.println("Sayı asaldır.");
			
		}else {
			System.out.println("Sayı asal değildir.");
		}
		

	}

}
