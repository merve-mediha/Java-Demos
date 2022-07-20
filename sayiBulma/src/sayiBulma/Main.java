package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5 ;
		boolean varMý=false;
		
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMý=true;
				break;
			}
		}
		if(varMý==true) {
			System.out.println("Sayý mevcuttur.");
		}
		else {
			System.out.println("Sayý mevcut deðildir.");
		}
		}

	}


