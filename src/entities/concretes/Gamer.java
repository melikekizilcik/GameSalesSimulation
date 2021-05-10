package entities.concretes;

import entities.abstracts.Entity;

public class Gamer implements Entity {
	int id;
	String nationalityId;
	String firstName;
	String lastName;
	String dateOfBirth;
	
	//Constructor:
	public Gamer() {
		
	}

	public Gamer(int id, String nationalityId, String firstName, String lastName, String dateOfBirth) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	
	//encapsulation:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	};
	
	
	
	
	
	
	
	
}

	
	
	