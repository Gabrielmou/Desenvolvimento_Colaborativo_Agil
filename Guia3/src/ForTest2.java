public class ForTest2 {
  public static void main(String[] args) {
    Player[] players = new Player[5];

    players[0] = new Player();
    players[0].row = 160;

    players[1] = new Player();
    players[1].row = 320;

    players[2] = new Player();
    players[2].row = 640;

    players[3] = new Player();
    players[3].row = 1280;

    players[4] = new Player();
    players[4].row = 2560;

    for(Player player: players) {
      System.out.println(player.row);
    }
  }
}