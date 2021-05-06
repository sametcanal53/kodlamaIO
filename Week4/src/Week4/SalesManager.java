package Week4;

public class SalesManager {

	public void sales(Game game, Gamer gamer) {
		System.out.println(gamer.getName() + " " + game.getName() + " Satýn Aldý.");
	}

	public void sales(Campaign campaign, Game game) {
		int result = game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscount() / 100);
		System.out.println(game.getName() + ", "+ campaign.getName() + " Sonraki Fiyat : " + result);
	}
}
