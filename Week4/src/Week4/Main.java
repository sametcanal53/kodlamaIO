package Week4;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		TCKimlikSorgulama sorgula = new TCKimlikSorgulama("53","Sametcan","Al",2001);
		Game game = new Game(1, "Assasins Creed Valhalla", 150);
		GameManager gameManager = new GameManager();
		Gamer gamer = new Gamer(1,"Sametcan","AL",53);
		GamerManager gamerManager = new GamerManager();
		SalesManager salesManager = new SalesManager();
		Campaign campaign = new Campaign(1,"Black Friday",10);
		
		
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.updatePrice(game);
		
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
		
		salesManager.sales(game,gamer);
		salesManager.sales(campaign, game);
		
		
	}

}
