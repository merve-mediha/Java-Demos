package m�kemmelSayi;

public class Main {

	public static void main(String[] args) {
		//pozitif tam b�lenlerinin toplam�  kendisine e�it olan say�
		
		int number =28 ;
		int total=0;
		
		for(int i=1; i<number ;i++) {
			if(number%i==0) {
				total=total+i;
				
			}
		}
		if(total==number) {
			System.out.println("M�kemmel Say�d�r");
		}else {
		System.out.println("M�kemmel Say� de�ildir");
		}
		}
	}

