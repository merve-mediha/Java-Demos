package polymorphismDemo;

public class Main {

		public static void main(String[] args) {
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesaj�");
//
//	
	
	BaseLogger[] loggers = new BaseLogger[] {new ConsoleLogger(),new FileLogger(), new EmailLogger(), new DatabaseLogger()};
	//hepsinin atas� bu bu y�zden baselogger loggerlar�n referans�n� tutabilir
	//�� elemanl� herbiri farkl� i� yapan ama hepsi baselogger t�r�nden eleman ekledik.
	//istedi�im zaman yeni bir logger ekleyip silebilirim plug and play
	
	
	for (BaseLogger logger : loggers) {
		logger.log("Log mesaj�  ");
		
	}
	
	System.out.println("........................................");
	//=>
	//art�k CustomerManager() parametre olarak hangisini verirsem o loglama yapar.
	CustomerManager customerManager = new CustomerManager(new FileLogger());
	customerManager.add();
 
		}
}
