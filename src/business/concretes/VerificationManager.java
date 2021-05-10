package business.concretes;

import business.abstracts.VerificationService;
import entities.concretes.Gamer;

public class VerificationManager implements VerificationService{

	@Override
	public void verify(Gamer gamer) {
		System.out.println("NationalityID verified: " + gamer.getNationalityId());
		System.out.println("First name verified: " + gamer.getFirstName());
		System.out.println("Last name verified: " + gamer.getLastName());
		System.out.println("Date of birth verified: " + gamer.getDateOfBirth());
	}
	
}
