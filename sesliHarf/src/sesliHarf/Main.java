package sesliHarf;

public class Main {

	public static void main(String[] args) {
		char harf='Ý';
		
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalýn sesli harf");
			
			break;

		default:
			System.out.println("Ýnce sesli harftir.");
			break;
		}
	}

}
