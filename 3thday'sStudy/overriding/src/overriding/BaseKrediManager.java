package overriding;

public class BaseKrediManager {
	//public final double hesapla(double tutar) //override edilmemesi i�in-> final 
	public  double hesapla(double tutar) {
		return tutar*1.18; //faiz oran� 
		
	}
}
