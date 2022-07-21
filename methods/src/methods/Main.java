package methods;

public class Main {
	public static void main(String[] args) {
		sayiBulmaca();
	}
		public static void sayiBulmaca() {
			int[] sayilar = new int[] {1,2,5,7,9,0};
			int aranacak = 5 ;
			boolean varMý=false;
			
			
			for (int sayi : sayilar) {
				if(sayi==aranacak) {
					varMý=true;
					break;
				}
			}
//			if(varMý==true) {
//				//System.out.println("Sayý mevcuttur: "+aranacak);
//				mesajVer(aranacak);
//			}
//			else {
//				System.out.println("Sayý mevcut deðildir: "+aranacak);
//			}
//			}
//		
//		public static void mesajVer(int aranacak) {
//			
//			System.out.println("Sayý mevcuttur: "+aranacak );,
			
			if(varMý==true) {
				mesajVer("Sayý mevcut: " +aranacak);
			}
			else {
				mesajVer("Sayý mevcut deðil: "+aranacak);
			}
			}
		
		public static void mesajVer(String mesaj) {
			
			System.out.println(mesaj);
		}
		}
		

			
		
	

