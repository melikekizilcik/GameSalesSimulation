import business.concretes.SellingManager;
import business.concretes.VerificationManager;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "123456789", "Melike", "Kýzýlcýk", "29.07.2000" );
		
		
		//Oyuncuyu doðrulamak için verificationManager'ý çaðýrýyoruz:
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.verify(gamer1);
		
		
		//Satýþ iþlemleri:
		SellingManager sellingManager = new SellingManager();
		sellingManager.Sell(gamer1);
		
		
		
	}

}
