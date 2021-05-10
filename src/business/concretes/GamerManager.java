package business.concretes;

import business.abstracts.GamerService;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Gamer added: " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated: " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted: " + gamer.getFirstName());
		
	}

}
