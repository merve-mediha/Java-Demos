package methods;

public class Main {
	public static void main(String[] args) {
		sayiBulmaca();
	}
		public static void sayiBulmaca() {
			int[] sayilar = new int[] {1,2,5,7,9,0};
			int aranacak = 5 ;
			boolean varM�=false;
			
			
			for (int sayi : sayilar) {
				if(sayi==aranacak) {
					varM�=true;
					break;
				}
			}
//			if(varM�==true) {
//				//System.out.println("Say� mevcuttur: "+aranacak);
//				mesajVer(aranacak);
//			}
//			else {
//				System.out.println("Say� mevcut de�ildir: "+aranacak);
//			}
//			}
//		
//		public static void mesajVer(int aranacak) {
//			
//			System.out.println("Say� mevcuttur: "+aranacak );,
			
			if(varM�==true) {
				mesajVer("Say� mevcut: " +aranacak);
			}
			else {
				mesajVer("Say� mevcut de�il: "+aranacak);
			}
			}
		
		public static void mesajVer(String mesaj) {
			
			System.out.println(mesaj);
		}
		}
		

			
		
	

