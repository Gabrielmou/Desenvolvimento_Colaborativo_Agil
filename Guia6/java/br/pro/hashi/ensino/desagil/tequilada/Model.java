package br.pro.hashi.ensino.desagil.tequilada;

import java.util.Stack;

public class Model {
	private boolean[][] isVisited;
	private Board board;
	private CpuPlayer cpuPlayer;
	private HumanPlayer humanPlayer;
	private Stack<Crumb> stack;
	private Target target;
	private Target target2;
	private Target target3;



	public Model() {
		board = new Board("incre2.txt");

		cpuPlayer = new CpuPlayer(board.getNumRows() - 1, board.getNumCols() - 1);
		humanPlayer = new HumanPlayer(0, 0);
		target = new Target(3,12);
		target2 = new Target(6,14);
		target3 = new Target(2,15);
		
		isVisited = new boolean[board.getNumRows()][board.getNumCols()];

		for(int i = 0; i < board.getNumRows(); i++) {
			for(int j = 0; j < board.getNumCols(); j++) {
				isVisited[i][j] = board.isWall(i,  j);
			}
		}

		stack = new Stack<>();

		isVisited[cpuPlayer.getRow()][cpuPlayer.getCol()] = true;
		stack.push(new Crumb(cpuPlayer.getRow(), cpuPlayer.getCol()));
	}

	public void update() {
		if(!stack.isEmpty()) {
			Crumb crumb = stack.peek();

			int i = crumb.getRow();
			int j = crumb.getCol();

			if(i > 0 && !isVisited[i - 1][j]) {
				cpuPlayer.move(-1, 0);
				isVisited[cpuPlayer.getRow()][cpuPlayer.getCol()] = true;
				stack.push(new Crumb(cpuPlayer.getRow(), cpuPlayer.getCol()));
			}
			else if(j > 0 && !isVisited[i][j - 1]) {
				cpuPlayer.move(0, -1);
				isVisited[cpuPlayer.getRow()][cpuPlayer.getCol()] = true;
				stack.push(new Crumb(cpuPlayer.getRow(), cpuPlayer.getCol()));
			}
			else if(i < board.getNumRows() - 1 && !isVisited[i + 1][j]) {
				cpuPlayer.move(1, 0);
				isVisited[cpuPlayer.getRow()][cpuPlayer.getCol()] = true;
				stack.push(new Crumb(cpuPlayer.getRow(), cpuPlayer.getCol()));
			}
			else if(j < board.getNumCols() - 1 && !isVisited[i][j + 1]) {
				cpuPlayer.move(0, 1);
				isVisited[cpuPlayer.getRow()][cpuPlayer.getCol()] = true;
				stack.push(new Crumb(cpuPlayer.getRow(), cpuPlayer.getCol()));
			}
			else {
				stack.pop();

				if(!stack.isEmpty()) {
					crumb = stack.peek();

					int rowShift = crumb.getRow() - cpuPlayer.getRow();
					int colShift = crumb.getCol() - cpuPlayer.getCol();

					cpuPlayer.move(rowShift, colShift);
				}
			}
		}
	}


	
	public Board getBoard() {
		return board;
	}
	public Player getCpuPlayer() {
		return cpuPlayer;
	}
	public Player getHumanPlayer() {
		return humanPlayer;
	}
	public Target getTarget() {
	    return target;
	  }
	public Target getTarget2() {
	    return target2;
	  }
	public Target getTarget3() {
	    return target3;
	  }

}
