package br.pro.hashi.ensino.desagil.tequilada;

public class Tequilada {
  public static void main(String[] args) {
    Engine engine = new Engine();

    engine.board = new Board();
    engine.board.loadFromFile("C:/Users/Gabriel Moura/workspace/Guia4/src/main/java/br/pro/hashi/ensino/desagil/tequilada/board.txt");

    engine.cpuPlayer = new Player(0, 0);
    engine.humanPlayer = new Player(0, 0);
    
    engine.update();
    System.out.println(engine.cpuPlayer.getRow() + " " + engine.cpuPlayer.getCol());;
  }
}