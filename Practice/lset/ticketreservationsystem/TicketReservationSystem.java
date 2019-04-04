package ticketreservationsystem;

import java.util.Scanner;

public class TicketReservationSystem {
	static Scanner reader;
	public static void main(String[] args) {
		reader = new Scanner(System.in);
		TicketReservationSystem ticketReservationSystem = new TicketReservationSystem();
		Theatre theatre = new Theatre();
		int key = 0;
		while (true) {

			System.out.println("\n========================================================");
			System.out.println("Ticket Reservation System");
			System.out.println("========================================================");
			System.out.println("1. Reserve A Ticket");
			System.out.println("2. Retrieve All The Tickets Reserved");
			System.out.println("3. Retrieve Reservation Rate");
			System.out.println("4. Cancel A Ticket");
			System.out.println("0. Exit");

			System.out.println(">>>Select Menu ");

			key = reader.nextInt();
			theatre.fillSeatNumber();
			ticketReservationSystem.fillMovieData(theatre);



			switch (key) {
			case 0:
				System.exit(0);
				break;

			case 1:
				ticketReservationSystem.reserveTicket(theatre);
				break;

			case 2:
				ticketReservationSystem.getTicketReserved();
				break;

			case 3:
				ticketReservationSystem.getReservationRate();
				break;


			case 4:
				ticketReservationSystem.cancelTicket();
				break;


			default:
				break;
			}
		}





	}



	private void fillMovieData(Theatre theatre) {
		Movie movie1 = new Movie();
		movie1.setMovieTitle("SpiderMan");
		movie1.setRunningTime("129 mins");
		movie1.setDirectorName("Sam Raimi");
		movie1.setGenre("Action");

		theatre.getMovieList().add(movie1);

		Movie movie2 = new Movie();
		movie2.setMovieTitle("The GodFather");
		movie2.setRunningTime("105 mins");
		movie2.setDirectorName("FranF.Coppola");
		movie2.setGenre("Drama");

		theatre.getMovieList().add(movie2);

		Movie movie3 = new Movie();

		movie3.setMovieTitle("Star Wars");
		movie3.setRunningTime("125 mins");
		movie3.setDirectorName("George Lucas");
		movie3.setGenre("SF");

		theatre.getMovieList().add(movie3);

		Movie movie4 = new Movie();

		movie4.setMovieTitle("Forrest Gump");
		movie4.setRunningTime("130 mins");
		movie4.setDirectorName("Robert Zemeckis");
		movie4.setGenre("Drama");

		theatre.getMovieList().add(movie4);


	}

	private void reserveTicket(Theatre theatre) {
		showMovieInfo(theatre);
		System.out.println("> Select a Number : ");
		int movieSelected = reader.nextInt();

		System.out.println("> Enter Number of Seats : ");
		int numberOfSeats = reader.nextInt();

		System.out.println("> Consecutive Seats ? (Y/N) : ");
		String isConsecutiveSeats = reader.next();

		boolean isConsecutiveSeatesNeeded = false;
		if (isConsecutiveSeats == "Y" || isConsecutiveSeats == "y" ) {
			isConsecutiveSeatesNeeded = true;
			theatre.showConsecutiveSeats(numberOfSeats);
		} else {
			isConsecutiveSeatesNeeded = false;
			theatre.displaySeats();
		}



		boolean seatEnteredWrongly = true;
		while (!seatEnteredWrongly ) {
			System.out.println("> Enter Seat Number (ex.  A2 A3) : ");

			Scanner newScanner = new Scanner(System.in);
			String seatNumber = newScanner.nextLine();

			String [] inputSeats = seatNumber.split(" ");

			int selectedRow = -1, selectedColumn = -1, consecutiveRow = -1;
			String selectedSeat;
			int i;
			
			if (inputSeats.length != numberOfSeats) {
				System.out.println("Invalid Seat Number!");
			}
			
			for (i = 0; i < inputSeats.length; i++) {
				selectedSeat = inputSeats[i];
				selectedRow  = selectedSeat.toUpperCase().charAt(0) - 'A';
				selectedColumn = selectedSeat.charAt(1) - '0' ;
				
				if (isConsecutiveSeatesNeeded) {
					
					if (i != 0 && consecutiveRow != selectedRow) {
						System.out.println("Invalid Seat Number!");
						break;
					}
					
					
					if (theatre.checkConsecutiveSeatAvailablity(selectedRow, selectedColumn)) {
						theatre.markSeatFilled(selectedRow, selectedColumn - 1);
					} else {
						System.out.println("Invalid Seat Number!");

						break;
					}
				} else {
					if (theatre.checkSeatAvailablity(selectedRow, selectedColumn)) {
						theatre.markSeatFilled(selectedRow, selectedColumn - 1);
					} else {
						System.out.println("Invalid Seat Number!");
						break;
					}
				}
			}
			
			if (i == inputSeats.length) {
				seatEnteredWrongly = false;
			}
		}

		System.out.println("> Do You Want To Buy ? (Y/N) : ");
		String isBuy = reader.next();


		theatre.showBookedSeats();












	}

	private void showMovieInfo(Theatre theatre) {
		theatre.getMovieList();
		System.out.println("No" + "\t" + "Title" + "\t\t\t" + "Running time" + "\t\t" + "Director" + "\t\t\t" + "Genre");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		int movieNumber = 1;
		for (Movie movie : theatre.getMovieList()) {
			System.out.println(movieNumber++ + "\t" + movie);
		}

	}

	private void getTicketReserved() {
		// TODO Auto-generated method stub

	}

	private void getReservationRate() {
		// TODO Auto-generated method stub

	}

	private void cancelTicket() {
		// TODO Auto-generated method stub

	}



}
