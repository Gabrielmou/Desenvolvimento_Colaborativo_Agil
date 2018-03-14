package br.pro.hashi.ensino.desagil.tequilada;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Model model = new Model();

            	View view = new View(model);

            	Controller controller = new Controller(model, view);
            	
            	JFrame frame = new JFrame();
            	
            	frame.addKeyListener(controller);

            	frame.setContentPane(view);

            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            	frame.setResizable(false);

            	frame.pack();

            	frame.setVisible(true);

            	Timer timer = new Timer(1000, controller);

            	timer.start();
            }
        });
	}
}
