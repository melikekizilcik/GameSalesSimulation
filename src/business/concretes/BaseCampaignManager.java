package business.concretes;

import entities.concretes.Campaign;

public class BaseCampaignManager {
	public void add(Campaign campaign) {
		System.out.println("New campaign added: " + campaign.getCampaignName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("Campaign updated: " + campaign.getCampaignName());
	} 

	public void delete(Campaign campaign) {
		System.out.println("Campain deleted: " + campaign.getCampaignName());
	}


}
