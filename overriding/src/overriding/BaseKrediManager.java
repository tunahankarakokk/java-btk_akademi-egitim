package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
//overridible 
//public final double hesapla(double tutar){return tutar * 1.18;}olarak
//yazarsak override edilmesini final keywordü kelimesi sayesinde engellemiş
//oluruz