package sesliHarf;

public class Main {

	public static void main(String[] args) {
		char harf='�';
		
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kal�n sesli harf");
			
			break;

		default:
			System.out.println("�nce sesli harftir.");
			break;
		}
	}

}
