import java.util.LinkedList;

public class ForTest {
  public static void main(String[] args) {
    LinkedList<Integer> l = new LinkedList<>();

    l.add(160);
    l.add(320);
    l.add(640);
    l.add(1280);
    l.add(2560);

    for(int i: l) {
      System.out.println(i);
    }
  }
}