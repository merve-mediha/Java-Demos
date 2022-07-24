package overriding;

public class BaseKrediManager {
	//public final double hesapla(double tutar) //override edilmemesi için-> final 
	public  double hesapla(double tutar) {
		return tutar*1.18; //faiz oranı 
		
	}
}
