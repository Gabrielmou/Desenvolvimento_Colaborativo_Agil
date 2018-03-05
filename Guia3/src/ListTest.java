import java.util.LinkedList;

public class ListTest {
  public static void main(String[] args) {
    LinkedList<Player> players = new LinkedList<>();

    Player player = new Player();

    player.row = 20;
    player.col = 40;

    players.add(player);

    System.out.println(players.get(0).row + " " + players.get(0).col);
  }
}