package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	//overriding
	//t�m kodlar i�in base class �al���rken burada farkl� bir i�lem yapacaksam yazabilirim
	
	public void log(String message) {
		System.out.println("Logged to database : " +message);
	}

}
