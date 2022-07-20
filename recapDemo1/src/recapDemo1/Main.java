package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 =12;
		int max = sayi1;
	
		if(max<sayi3 & sayi2<sayi3) {
			max=sayi3;
		}
		if(sayi2>max & sayi2>sayi3) {
			max=sayi2;
		}
		
		System.out.println("En büyük=  " + max);
	}

}
