package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6,7.2};
		
		double total = 0;
		
		double max = myList[0];
		
		for (double number : myList) {
			
			if(number>max) {
				
				max=number;
			}
			
			total=total+number;
			
			System.out.println(number);
			
		}
			
		System.out.println("Toplam= "+total);	
		System.out.println("En Büyük= "+ max);	
			
		
		

	}

}
