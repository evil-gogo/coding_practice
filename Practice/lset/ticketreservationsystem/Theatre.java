package ticketreservationsystem;

import java.util.ArrayList;

public class Theatre {
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	private String [][] seats = new String[3][8];
	private String [][]tempSeat = new String[3][8];
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
	public void setMovieList(ArrayList<Movie> movieList) {
		this.movieList = movieList;
	}
	public String[][] getSeats() {
		return seats;
	}
	public void setSeats(String[][] seats) {
		this.seats = seats;
	}


	public void displaySeats() {
		System.out.println("[ Seat Display ]");
		char row = 'A';
		for (int i = 0; i < seats.length; i++) {
			row = (char) ('A' +  i);
			System.out.print("" +  row  +  " : ");
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void fillSeatNumber() {
		for (int i = 0; i < seats.length; i++) {

			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = ""+ (j + 1)+ "\t";
			}
			System.out.println();
		}
	}

	public void displayConsecutiveSeats(String[][] tempSeat) {
		System.out.println("[ Seat Display ]");
		char row = 'A';
		for (int i = 0; i < tempSeat.length; i++) {
			row = (char) ('A' +  i);
			System.out.print("" +  row  +  " : ");
			for (int j = 0; j < tempSeat[i].length; j++) {
				System.out.print(tempSeat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void markSeatFilled(int selectedRow, int selectedColumn) {
		seats[selectedRow][selectedColumn] = "X\t" ;
		tempSeat[selectedRow][selectedColumn] = "X\t";
	}



	public void showBookedSeats() {

	}

	public void showConsecutiveSeats(int numberOfSeats) {
		for (int i = 0; i < seats.length; i++) {
			tempSeat[i] = seats[i];
		}

		int notContinuosfrom = 0, notContinuosTo = 0;

		for (int i = 0; i < tempSeat.length; i++) {
			notContinuosfrom = 0;
			for (int j = 0; j < tempSeat[i].length; j++) {
				if (tempSeat[i][j] == "X\t") {
					notContinuosTo = j;
					if (notContinuosTo - notContinuosfrom -1 < numberOfSeats) {
						for (int k = notContinuosfrom; k < notContinuosTo; k++) {
							tempSeat[i][k] = "*\t";
						}
						notContinuosfrom = j + 1;
					} else {
						notContinuosfrom = notContinuosTo + 1;
					}
				}
			}

			if (tempSeat[i].length - 1 - notContinuosTo  < numberOfSeats) {
				for (int k = notContinuosTo + 1 ; k < tempSeat[i].length ; k++) {
					tempSeat[i][k] = "*\t";
				}
			}
		}

		displayConsecutiveSeats(tempSeat);
	}
	public boolean checkConsecutiveSeatAvailablity(int selectedRow, int selectedColumn) {
		if (tempSeat[selectedRow][selectedColumn] == "*\t" || tempSeat[selectedRow][selectedColumn] == "X\t")
			return false;
		else 
			return true;
		
	}
	public boolean checkSeatAvailablity(int selectedRow, int selectedColumn) {
		if (seats[selectedRow][selectedColumn] == "X\t")
			return false;
		else 
			return true;
	}
}
