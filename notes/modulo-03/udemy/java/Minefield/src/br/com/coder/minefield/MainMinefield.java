package br.com.coder.minefield;

import java.util.Arrays;
import java.util.Scanner;

public class MainMinefield {
	public static void main(String[] args) throws Exception {
		
		Minefield minefield = new Minefield(10);
		minefield.generateMines();
		minefield.startGame(new Scanner(System.in));
		
	}
}
