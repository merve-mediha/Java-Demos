package polymorphismDemo;

public class CustomerManager {
	
	
	//=>
			private BaseLogger logger;
			
			public CustomerManager(BaseLogger baseLogger) {
				this.logger= baseLogger;
				
			}
			//=>
			//baselogger olarak file database hepsini parametre olarak alabiliriz
	
	public void add() {
		System.out.println("M��teri Eklendi ");
		this.logger.log("log mesaj� ");
		//m��teriyi kim ekledi gibi loglar yazmak isteriz.
		
		
	/*		DatabaseLogger logger =new DatabaseLogger();
			logger.Log("Log mesaj�");
			//ba�l�l�k olu�turduk database e ba�l�y�z
		
		//ba��ml� sistem olu�turmak yerine logger de�i�se de ba�l� kalmamak i�in => 
	*/
	}
}
