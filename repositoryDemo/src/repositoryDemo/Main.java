package repositoryDemo;

public class Main {

	public static void main(String[] args) {

		//REPOSITORYDESIGNPATTERN
		//GENELDE VERİTABANI İŞLEMLERİ İÇİN KULLANILIR
		Validator validator = new Validator();
		Customer customer = new Customer();
		validator.validate(customer);
		
	}

}
