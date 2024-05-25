package classesWithAttributes;

public class Product {//constructor
	
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {//constructor
		System.out.println("Yapıcı blok (Constructor) çalıştı");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}
	public Product(){
		
	}
	
	//attribute || field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//getter
	public int getId() {
		
		return id;
	}
	
	//setter
	public void setId(int id) {
		this.id = id;//benim içerisinde bulunduğum class
		
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public int getstockAmount() {
		return stockAmount;
	}

	public void setstockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getrenk() {
		return renk;
	}

	public void setrenk(String renk) {
		this.renk = renk;
	}

	public String getkod() {
		return kod;
	}

	public void setkod(String kod) {
		this.kod = kod;
	}
	
	
	
}
