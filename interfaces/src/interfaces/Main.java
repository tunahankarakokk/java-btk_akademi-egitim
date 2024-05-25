package interfaces;

public class Main {

	public static void main(String[] args) {
	ICustomerDal customerDal = new OracleCustomerDal();//ana interface imzasını tutabilir
	//operasyonu implemente edilmesi istenen durumlarda kullanılır.
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal = new OracleCustomerDal();
									//new MySqlCustomerDal();
		customerManager.add();
		
		
	}

}
