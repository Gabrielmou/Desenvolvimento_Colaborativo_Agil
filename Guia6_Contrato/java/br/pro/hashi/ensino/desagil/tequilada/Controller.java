package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//A expressão "implements ActionListener" estabelece
//que objetos dessa classe podem reagir ao relógio.
public class Controller implements ActionListener,KeyListener {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// Esse método especial, que a expressão "implements ActionListener"
	// obriga a ter, é o método chamado pelo relógio a cada segundo.
	@Override
	public void actionPerformed(ActionEvent event) {
		model.update();
		view.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		if(event.getKeyCode() == KeyEvent.VK_SPACE) {
			System.out.println("pressionei espaço!");
		}
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			if (model.getBoard().isWall(model.getHumanPlayer().getRow(), model.getHumanPlayer().getCol()-1)){
				model.getHumanPlayer().move(0, 0);
			}
			else {
				model.getHumanPlayer().move(0, -1);
			}
			
		}
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (model.getBoard().isWall(model.getHumanPlayer().getRow(), model.getHumanPlayer().getCol()+1)){
				model.getHumanPlayer().move(0, 0);
			}
			else {
				model.getHumanPlayer().move(0, 1);
			}
			
		}
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			if (model.getBoard().isWall(model.getHumanPlayer().getRow()-1, model.getHumanPlayer().getCol())){
				model.getHumanPlayer().move(0, 0);
			}
			else {
				model.getHumanPlayer().move(-1, 0);
			}
					}
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			if (model.getBoard().isWall(model.getHumanPlayer().getRow()+1, model.getHumanPlayer().getCol())){
				model.getHumanPlayer().move(0, 0);
			}
			else {
				model.getHumanPlayer().move(1, 0);
			}
					}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}