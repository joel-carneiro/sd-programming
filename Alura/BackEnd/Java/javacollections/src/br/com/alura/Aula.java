package br.com.alura;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	// Methods
	
	@Override
	public int compareTo(Aula o) {
		if (this.tempo > o.tempo)
			return 1;
		if (this.tempo < o.tempo)
			return -1;
		
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %smin", this.titulo, this.tempo);
	}
	
	// Getters and Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
