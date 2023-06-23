package screenwatch.models;

public class Episode implements Sortable {
	private int seasonNumber;
	private String name;
	private Series series;
	private int totalRatings;
	private double sumOfRatings;

	public Episode(int seasonNumber, String name, Series series) {
		this.seasonNumber = seasonNumber;
		this.name = name;
		this.series = series;
	}
	
	@Override
	public double getAverage() {
		return this.sumOfRatings / this.totalRatings ;
	}
	
	@Override
	public void evalute(double note) {

		if (note > 10 || note < 0) {
			System.out.println("Não é possível avaliar com uma nota maior que 10 ou menor que 0.");
		} else {
			this.sumOfRatings += note;
			this.totalRatings += 1;
		}
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

}
