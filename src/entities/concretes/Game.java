package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity{
	int id;
	int categoryId;
	String name;
	double price;
	
	//Constructor:
	public Game() {
		
	}
	
	//Constructor:
	public Game(int id, int categoryId, String name, double price) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.price = price;
	}

	
	//Encapsulation:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
	
	
	

}
