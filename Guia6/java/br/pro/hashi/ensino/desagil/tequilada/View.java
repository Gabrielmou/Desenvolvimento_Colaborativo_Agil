package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class View extends JPanel {
	private static final long serialVersionUID = 1L;

	private static final int CELL_SIZE = 50;


	private Model model;
	private Image cpuPlayerImage;
	private Image humanPlayerImage;
	private Image targetImage;
	private Image targetImage2;
	private Image targetImage3;


	public View(Model model) {
		this.model = model;

		cpuPlayerImage = loadImage("cpuPlayer");
		humanPlayerImage = loadImage("humanPlayer");
		targetImage = loadImage("target");
		targetImage2 = loadImage("target");
		targetImage3 = loadImage("target");


		setPreferredSize(new Dimension(model.getBoard().getNumCols() * CELL_SIZE, model.getBoard().getNumRows() * CELL_SIZE));
	}


	private Image loadImage(String filename) {
		URL url = getClass().getResource("/" + filename + ".png");
		ImageIcon icon = new ImageIcon(url);
		return icon.getImage();
	}

	private void drawImage(Graphics g, Image image, Element element) {
		g.drawImage(image, element.getCol() * CELL_SIZE, element.getRow() * CELL_SIZE, CELL_SIZE, CELL_SIZE, null);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		
		g.fillRect(0, 0, model.getBoard().getNumCols() * CELL_SIZE, model.getBoard().getNumRows() * CELL_SIZE);
		
		for(int i = 0; i < model.getBoard().getNumRows(); i++) {
			for(int j = 0; j < model.getBoard().getNumCols(); j++) {
				if(model.getBoard().isWall(i, j) == true){
					g.setColor(Color.BLACK);
					g.fillRect(CELL_SIZE*j, CELL_SIZE*i,CELL_SIZE,CELL_SIZE);
				}
			}
		}
		drawImage(g, cpuPlayerImage, model.getCpuPlayer());
		drawImage(g, humanPlayerImage, model.getHumanPlayer());
		drawImage(g, targetImage, model.getTarget());
		drawImage(g, targetImage2, model.getTarget2());
		drawImage(g, targetImage3, model.getTarget3());

		getToolkit().sync();
    }
}
