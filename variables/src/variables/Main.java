package variables;

public class Main {

	public static void main(String[] args) {
		int ogrenciSayisi =10;
		System.out.println("Öðrenci sayýsý: " + ogrenciSayisi);
		//deðiþimleri (tek yerden)kolaylaþtýrýr. reusability tekrar kullanýlabilirliði artýrýr.
		
		String mesaj = "ogrenciSayisi= ";
		
		System.out.println(mesaj + ogrenciSayisi);
		
		System.out.println("Öðrenci sayýsý:9");
		System.out.println("Öðrenci sayýsý:9");
		
		//bellekten tasarruf yapmak için bir tane mesaj tanýmlayýp her yerde yazabiliriz.
		//bellek yönetimi ve reusability için deðiþken tanýmlarýz.
		
	}

}
