package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
				
//		System.out.println("Eleman sayýsý: "+mesaj.length());
//		System.out.println("5.eleman: " +mesaj.charAt(4));
//		System.out.println(mesaj.concat("Yaþasýn!")); //mesajla birleþtir
//		
//		
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.startsWith("A"));
//		
//		System.out.println(mesaj.endsWith("."));	
//		System.out.println(mesaj.endsWith("l"));
//		
//		
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 4, karakterler, 0);
//		System.out.println(karakterler);
//		
//		System.out.println(mesaj.indexOf("a")); //ilk bulduðu a kaçýncý karakter
//		System.out.println(mesaj.indexOf("ün"));
//		System.out.println(mesaj.lastIndexOf("ç"));
		
		//replace yapalým
		System.out.println(mesaj.replace(" ", "-"));
		
		System.out.println(mesaj);
		//replace edileni yeniden kullanmak için
		String yeniMesaj =  mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(7, 10));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		} 
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase()); //büyük küçük harf duyarlý olduðu zaman 
												//veritabanýna arama ifadesi gönderdiðimizde kullanabiliriz.
		
		
	}
	
}


