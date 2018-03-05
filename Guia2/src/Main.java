
public class Main {
	public static void main(String[] args) {
	    player humanPlayer;

	    humanPlayer = new player();

	    humanPlayer.row = 32;
	    humanPlayer.col = 24;
	    humanPlayer.printPosition();

	    player cpuPlayer;

	    cpuPlayer = new player();

	    cpuPlayer.row = 99;
	    cpuPlayer.col = 1;
	    cpuPlayer.printPosition();
	}
}
