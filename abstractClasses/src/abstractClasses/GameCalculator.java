package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();//extends edenler bunu override etmek zorunda
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
