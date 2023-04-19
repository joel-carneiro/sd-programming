package br.com.coder.minefield;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minefield {
	int[][] mines;
	String[][] field;
	int squareNumber;

	public Minefield(int squareNumber) {
		this.squareNumber = squareNumber;
		// Criação do campo vazio (visível e o de processamento)
		this.mines = new int[squareNumber][squareNumber];
		this.field = new String[squareNumber][squareNumber];
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(mines);
	}

	public void generateMines() {
		Random random = new Random();
		
		for (int i = 0; i < squareNumber; i++) {
			for (int j = 0; j < squareNumber; j++) {
				mines[i][j] = random.nextInt(2);
				field[i][j] = "O";
			}
		}
	}
	
	public void showMines() {
		for (int[] line : mines) {
			System.out.println(Arrays.toString(line));
		}
	}
	
	public void showFields() {
		for (String[] line : field) {
			System.out.println(Arrays.toString(line));
		}
	}
	
	public void play(int x, int y) throws Exception {
		if (mines[x][y] == 1) {
			throw new Exception("VOCÊ ESCOLHEU UMA BOMBA! >:)");
		} else {
			field[x][y] = "\u001B[31mX\u001B[0m";
		}
	}
	
	public void startGame(Scanner scanner) throws Exception {
		while (true) {
			showFields();
			
			System.out.print("X: ");
			int x = scanner.nextInt();
			
			System.out.print("Y: ");
			int y = scanner.nextInt();
			
			if (x >= 10 || y >= 10) {
				startGame(scanner);
			}
			
			play(x, y);
		}
	}
}
