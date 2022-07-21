package methods2;

public class Main {

	public static void main(String[] args) {
		//////////////////7
		String mesaj = "Bugün hava çok güzel.";
		//mesaj.substring(0, 2);
		///String yeniMesaj=mesaj.substring(0, 2); //substring bir deðer döndürür.
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
	////	int sayi = topla(5+7);  olmaz parametre yok
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,10); //arka planda diziye çevirir. int[]
		System.out.println(toplam);
	}
	public static void ekle() {
		System.out.println("Eklendi"); //sonuç döndürmüyor
		
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
		
	}
	//void operasyon emir kipi gibi...istek veriyoruz o da iþlemi yapýyor.

	//mesela ekledik. o datayý geri istediðimizde void deðiþir
	//void operasyonlarý bir deðere atayamayýz
	
	//deðer döndüren return eden metodlar //////////////7
	
	
////	public static int topla() { //int türünde bir deðer döndürecek fonksiyon
//		return 5;
//		
//	}
	public static int topla(int sayi1,int sayi2) { //bu sadece 2 sayý toplamama izin verir
		return sayi1+sayi2;
	}
	
	//hesap makinesi gibi istenilen kadar sayý toplama için; variable arguments kullanýrýz
	
	public static int topla2(int... sayilar) { //birden fazla integer gönderdiðimi ... 3 nokta belirler buna variable arguments denir
		int toplam =0;
		for (int sayi : sayilar) {
			toplam+=sayi;
			
		} 
		return toplam;
		
	}
	
	

	 
	
	public static String sehirVer() {
		return"Ankara";
	}
	
}
