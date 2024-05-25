package arrayListWithClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer engin = new Customer(1,"Engin","Demiroğ");
		customers.add(engin);
		customers.add(new Customer(2,"Derin","Demiroğ"));
		customers.add(new Customer(3,"Salih","Demiroğ"));
		
		customers.remove(engin);
		//silinmez hiç bir şekilde
		
		for (Customer customer : customers) {
			System.out.println(customer.id + " " + customer.firstName + " " + customer.lastName);
		}
	}

}
