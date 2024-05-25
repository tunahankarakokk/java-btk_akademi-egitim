package staticDemo;

public class Main {

	public static void main(String[] args) {
		//static yapı başka biryerden çağırmaya çalışırsak newleyerek ulaşamayız
		//Main.main diyerek ulaşabiliriz
		//staticler direk class ismiyle çağrılır ve kullanılır
		ProductManager manager= new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Mouse";
		manager.add(product);
	
	DatabaseHelper.Crud.Delete();
	
	
	}

}
