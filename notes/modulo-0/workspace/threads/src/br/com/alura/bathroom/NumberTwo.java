package br.com.alura.bathroom;

public class NumberTwo implements Runnable {

	private Bathroom bathroom;

	public NumberTwo(Bathroom bathroom) {
		this.bathroom = bathroom;
	}

	@Override
	public void run() {
		bathroom.numberTwo();
	}

}
