package br.com.cod3r.calculator;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame {
	
	int WIDTH = 232;
	int HEIGTH = 322;
	
	public CalculatorFrame() {
		setSize(WIDTH, HEIGTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
