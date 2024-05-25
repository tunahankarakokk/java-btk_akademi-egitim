package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
		
		//sınıf            herhangibirisim = new tekrar sınıf ismi
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;//customermanager ın referans nosu customermanager2 nin referans numarasına eşittir
		//verdiğimizisim.içerisindeki metod ismi();
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;//sayi2 = 10;
		sayi1 =30;//sayi1 = 30;
		System.out.println(sayi2);//10
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
		
	}
	

}
