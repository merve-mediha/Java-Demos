package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
				
//		System.out.println("Eleman say�s�: "+mesaj.length());
//		System.out.println("5.eleman: " +mesaj.charAt(4));
//		System.out.println(mesaj.concat("Ya�as�n!")); //mesajla birle�tir
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
//		System.out.println(mesaj.indexOf("a")); //ilk buldu�u a ka��nc� karakter
//		System.out.println(mesaj.indexOf("�n"));
//		System.out.println(mesaj.lastIndexOf("�"));
		
		//replace yapal�m
		System.out.println(mesaj.replace(" ", "-"));
		
		System.out.println(mesaj);
		//replace edileni yeniden kullanmak i�in
		String yeniMesaj =  mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(7, 10));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		} 
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase()); //b�y�k k���k harf duyarl� oldu�u zaman 
												//veritaban�na arama ifadesi g�nderdi�imizde kullanabiliriz.
		
		
	}
	
}


