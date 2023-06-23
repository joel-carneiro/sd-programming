package br.com.alura.bathroom;

public class NumberOne implements Runnable {

	private Bathroom bathroom;

	public NumberOne(Bathroom bathroom) {
		this.bathroom = bathroom;
	}

	@Override
	public void run() {
		bathroom.numberOne();
	}

}
