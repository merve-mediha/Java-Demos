package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 25 ;
		int remainder = number%2;
		System.out.println(remainder);
		
		//1 asal say� g�sterdi�i i�in----defensive programming i�in
		if(number==1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Ge�ersiz say�!");
		}
		
		boolean isPrime = true;
		for(int i = 2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) { //bu �ekilde b�rakmak ile isPrime==true demek ayn�d�r.
			System.out.println("Say� asald�r.");
			
		}else {
			System.out.println("Say� asal de�ildir.");
		}
		

	}

}
