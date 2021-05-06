package Week4;

public class GamerManager {

	public void add(Gamer gamer) {
		System.out.println("Gamer Sisteme Eklendi : " + gamer.getName());
	}

	public void delete(Gamer gamer) {
		System.out.println("Gamer Sistemden Silindi : " + gamer.getName());
	}

	public void update(Gamer gamer) {
		System.out.println("Gamer Bilgileri Guncellendi : " + gamer.getName());
	}
}
