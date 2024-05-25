package arraylistDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		int[] sayilar = new int[] {1,2,3};
		sayilar = new int[4];
		System.out.println(sayilar[0]);
		*/
		ArrayList sayilar = new ArrayList();//bu şekilde tanımlama yaparsak içine her türde veriyi alabilir
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		//System.out.println("Eleman sayısı : "+sayilar.size());
		//System.out.println(sayilar.get(2));
		//sayilar.set(0,100);
		//System.out.println(sayilar.get(0));
		//sayilar.set(2,"Konya");
		//System.out.println(sayilar.get(2));
		//sayilar.remove(0);//bir indexteki elemanı silmek
		//System.out.println(sayilar.get(0));
		
		for (Object a : sayilar) {
			System.out.println(a);
		}
		
		
		
		
	}

}
