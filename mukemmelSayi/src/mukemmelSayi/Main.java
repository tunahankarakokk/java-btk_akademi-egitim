package mukemmelSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//6--> bölenleri 1,2,3 - mükemmel sayıdır
		//28-->bölenleri 1,2,4,7,14 -  mükemmel sayıdır
		
		int number = 5;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total +=i;
			}
		}
		if (number == total) {
			System.out.println(number + " mükemmel sayidir");
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
		
	}

}
