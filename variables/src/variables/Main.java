package variables;

public class Main {

	public static void main(String[] args) {
		int ogrenciSayisi =10;
		System.out.println("��renci say�s�: " + ogrenciSayisi);
		//de�i�imleri (tek yerden)kolayla�t�r�r. reusability tekrar kullan�labilirli�i art�r�r.
		
		String mesaj = "ogrenciSayisi= ";
		
		System.out.println(mesaj + ogrenciSayisi);
		
		System.out.println("��renci say�s�:9");
		System.out.println("��renci say�s�:9");
		
		//bellekten tasarruf yapmak i�in bir tane mesaj tan�mlay�p her yerde yazabiliriz.
		//bellek y�netimi ve reusability i�in de�i�ken tan�mlar�z.
		
	}

}
