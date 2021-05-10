package business.concretes;

import business.abstracts.SellingService;
import entities.concretes.Campaign;
import entities.concretes.Gamer;

public class SellingManager implements SellingService {
	Gamer gamer;
	
	
	
	@Override
	public void Sell(Gamer gamer) {
		this.gamer = gamer;
		
		System.out.println("Campaign has been implemented");
		System.out.println("Game has been sold. Have a good time :" + gamer.getFirstName());
		
	}

}
