package miniProjeAsalSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) 
	{
	/*
		int number = 25;
		String durum = "Sayı asaldır";
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				durum = "Sayı asal değildir";
			}
			
		}
		System.out.println(durum);
		*/
		int number =-6;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		if (number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0 ) 
			{
				isPrime = false;
			}
		}
		if(isPrime) 
		{
		System.out.println("Sayı Asaldır");
		}
		else {
			System.out.println("Sayı Asal değildir");
		}

	}
}
