package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	//overriding
	//tüm kodlar için base class çalýþýrken burada farklý bir iþlem yapacaksam yazabilirim
	
	public void log(String message) {
		System.out.println("Logged to database : " +message);
	}

}
