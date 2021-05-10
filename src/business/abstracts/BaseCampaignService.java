package business.abstracts;

import entities.concretes.Campaign;

public interface BaseCampaignService {

	abstract double sale(Campaign campaign);
}
