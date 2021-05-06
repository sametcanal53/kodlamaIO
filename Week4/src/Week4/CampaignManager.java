package Week4;

public class CampaignManager {

	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi : " + campaign.getName());
	}

	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi : " + campaign.getName());
	}

	public void update(Campaign campaign) {
		System.out.println("Kampanya Guncellendi : " + campaign.getName());
	}

}
