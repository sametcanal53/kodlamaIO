package Week4;

public class GameManager {

	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());
	}

	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());
	}

	public void updatePrice(Game game) {
		System.out.println("Oyunun fiyatý güncellendi : " + game.getUnitPrice());
	}
}
