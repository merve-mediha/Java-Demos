package methods2;

public class Main {

	public static void main(String[] args) {
		//////////////////7
		String mesaj = "Bug�n hava �ok g�zel.";
		//mesaj.substring(0, 2);
		///String yeniMesaj=mesaj.substring(0, 2); //substring bir de�er d�nd�r�r.
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
	////	int sayi = topla(5+7);  olmaz parametre yok
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,10); //arka planda diziye �evirir. int[]
		System.out.println(toplam);
	}
	public static void ekle() {
		System.out.println("Eklendi"); //sonu� d�nd�rm�yor
		
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("G�ncellendi");
		
	}
	//void operasyon emir kipi gibi...istek veriyoruz o da i�lemi yap�yor.

	//mesela ekledik. o datay� geri istedi�imizde void de�i�ir
	//void operasyonlar� bir de�ere atayamay�z
	
	//de�er d�nd�ren return eden metodlar //////////////7
	
	
////	public static int topla() { //int t�r�nde bir de�er d�nd�recek fonksiyon
//		return 5;
//		
//	}
	public static int topla(int sayi1,int sayi2) { //bu sadece 2 say� toplamama izin verir
		return sayi1+sayi2;
	}
	
	//hesap makinesi gibi istenilen kadar say� toplama i�in; variable arguments kullan�r�z
	
	public static int topla2(int... sayilar) { //birden fazla integer g�nderdi�imi ... 3 nokta belirler buna variable arguments denir
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
