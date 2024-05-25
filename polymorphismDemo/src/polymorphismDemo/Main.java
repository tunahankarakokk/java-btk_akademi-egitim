package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		EmailLogger logger = new EmailLogger();
		logger.Log("log mesajı");
		
		DatabaseLogger logger2 = new DatabaseLogger();
		logger2.Log("log mesajı");
		*/
		
		//plug and play
		
		/*
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger : loggers) {
			logger.Log("Log mesajı");
		}
		*/
  //yukarıdakilerin hepsinin annesi baselogger olduğu için böyle
//kullanabiliyoruz çünkü referansını tutabilir.
	
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());//polymorphism
														     //new FileLogger()
														     //new EmailLogger()
		customerManager.add();
		
		
		
		
		
	}

}
