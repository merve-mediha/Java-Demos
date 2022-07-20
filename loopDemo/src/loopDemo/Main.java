package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i=2; i<10; i+=2) {
			 System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
	

	//while için
	int i = 1 ;
	while(i<10) {
		System.out.println(i);
		i++;
	}
		System.out.println("While Döngüsü Bitti");
		
	//Do While Döngüsü
		int j=100;
		do {
			System.out.println();
			System.out.println(j);
			j+=3;
		}while(j<10);
		System.out.println("Do while Döngüsü Bitti");
		
//while döngüsünden farký þart saðlanmasa bile do while bir kere çalýþacaktýr.	
//

}
}

