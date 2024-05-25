package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try
		{
			int[] sayilar = new int[] {1,2,3};
			System.out.println(sayilar[5]);
		}
		catch(StringIndexOutOfBoundsException exception) {//(Exception exception)
			System.out.println("Hata Oluştu : " + exception);
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Hata Oluştu : " + exception);
		}
		catch(Exception exception) {
			System.out.println("Hata loglandı");
		}
		finally {
			System.out.println("Ben her türlü çalışırım");
		}
		
	}

}
