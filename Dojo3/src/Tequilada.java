public class Tequilada {
	public static void main(String[] args) {
		Engine engine = new Engine();

		engine.board = new Board();
		engine.board.loadFromFile("incre2.txt");

		engine.cpuPlayer = new Player();
		engine.humanPlayer = new Player();
	}
}