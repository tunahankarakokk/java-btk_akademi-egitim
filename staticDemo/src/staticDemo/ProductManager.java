package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)){
			System.out.println(product.name +  "\n" + product.price +"\n" + "Eklendi");
		}
		else {
			System.out.println("Eklenemedi ürün bilgileri geçersiz");
		}
		
		
		
	}
}
