package sesliHarfler;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';
		/*
		
		char[] kalinsesli = {'A','a','I','ı','O','o','u','U'};
		char[] incesesli = {'E','e','i','İ','Ö','ö','ü','Ü'};
		
		for (char i : incesesli) {
			if (i == harf) {
				System.out.println(harf + " ince sesli bir harftir");
			}
		}
		for (char k : kalinsesli) {
			if (k == harf){
				System.out.println(harf + " kalin sesli bir harftir");
			}
		}
		*/
		switch(harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("Kalın sesli harf");
		break;
		default :
			System.out.println("İnce sesli harf");
		}
	}

}
