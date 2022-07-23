package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new Tar�mKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		

	}

}
