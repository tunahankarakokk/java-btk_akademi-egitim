package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		Product product = new Product();
		product.setname("Laptop");
		product.setId(1);
		product.setname("Asus Laptop");  
		product.setprice(5000);
		product.setstockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);

		//System.out.println(product.name);
	}

}
