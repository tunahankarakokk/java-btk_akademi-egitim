//built-in javanın içindeki kütüphaneler
package packagesDemo;
import java.util.Scanner;//başka bir paketi kullanmak için import etmek gerekir

import matematik.DortIslem;
import matematik.Logaritma;//import.matematik.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adınız : ");
		
		String isim = scanner.nextLine();
		System.out.println("Merhaba " + isim);
		
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(5, 10);
		
		Logaritma logaritma = new Logaritma();
		logaritma.LogaritmaHesap();
		
	}

}
