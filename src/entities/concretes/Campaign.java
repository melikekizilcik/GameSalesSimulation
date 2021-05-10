package entities.concretes;

import entities.abstracts.Entity;

public class Campaign implements Entity{
	int id;
	String campaignName;
	String couponCode;
	
	
	//Constructor:
	public Campaign() {
		
	}


	//Constructor:
	public Campaign(int id, String campaignName, String couponCode) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.couponCode = couponCode;
	}


	//Encapsulation:
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getCouponCode() {
		return couponCode;
	}


	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	
	
	
}
