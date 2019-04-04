package ticketreservationsystem;

public class Movie {
	private String movieTitle;
	private String runningTime;
	private String directorName;
	private String genre;
	
	
	private int quantity;
	
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieName) {
		this.movieTitle = movieName;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return movieTitle + "\t\t" + runningTime + "\t\t" + directorName + "\t\t\t" +  genre;
	}
	
}
