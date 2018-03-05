
public class ArrayTest {
	public static void main(String[] args){
		player[] player1 = new player[10];
		player1[5] = new player();
		
		player1[5].row = 20;
	    player1[5].col = 40;

	    System.out.println(player1[5].row + " " + player1[5].col);
		
	}
}
