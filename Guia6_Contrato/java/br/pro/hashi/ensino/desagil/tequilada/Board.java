package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Board {
	private boolean[][] isWall;
	private int numRows;
	private int numCols;


	public Board(String path) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));

			String line = reader.readLine();

			String[] words = line.split(" ");

			numRows = Integer.parseInt(words[0]);
			numCols = Integer.parseInt(words[1]);

			isWall = new boolean[numRows][numCols];

			for(int i = 0; i < numRows; i++) {
				line = reader.readLine();

				for(int j = 0; j < numCols; j++) {
					boolean value;

					if(line.charAt(j) == '#') {
						value = true;
					}
					else {
						value = false;
					}

					isWall[i][j] = value;
				}
			}

			reader.close();
		}

		catch(FileNotFoundException exception) {
			System.out.println(exception);
		}

		catch(IOException exception) {
			System.out.println(exception);
		}
	}


	public int getNumRows() {
		return numRows;
	}
	public int getNumCols() {
		return numCols;
	}
	public boolean isWall(int row, int col) {
	    return isWall[row][col];
	}
}
