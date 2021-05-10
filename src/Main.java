import business.concretes.SellingManager;
import business.concretes.VerificationManager;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "123456789", "Melike", "K�z�lc�k", "29.07.2000" );
		
		
		//Oyuncuyu do�rulamak i�in verificationManager'� �a��r�yoruz:
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.verify(gamer1);
		
		
		//Sat�� i�lemleri:
		SellingManager sellingManager = new SellingManager();
		sellingManager.Sell(gamer1);
		
		
		
	}

}
