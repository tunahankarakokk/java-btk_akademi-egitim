package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String,String> sozluk = new HashMap<String,String>();
		sozluk.put("book", "kitap");
		sozluk.put("table", "masa");
		sozluk.put("computer", "bilgisayar");
		System.out.println(sozluk.size());//boyutu
		
		for (String item : sozluk.keySet()){//book table computer = keyset
			System.out.println("Eleman : " + item + " Değer : " + sozluk.get(item));
		}
		
		sozluk.remove("table");
		System.out.println(sozluk);
		System.out.println(sozluk.get("table"));

		
	}

}
