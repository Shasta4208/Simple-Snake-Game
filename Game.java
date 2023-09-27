
public class Game {

	public static void main(String[] args) {
		int GAME_SIZE = 30;
		Functions g = new Functions(GAME_SIZE, GAME_SIZE);
		g.run();
		Intro i = new Intro();
		i.run();

	}
}
