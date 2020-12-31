package xworkz.com.xworkzapp.flightbooking;

public class FlightBooking {

	public FlightBookingDTO[] flightDTO;
	public int index;

	public FlightBooking(int size) {
		flightDTO = new FlightBookingDTO[size];
	}

	public void addFlightDetails(FlightBookingDTO flight) {
		if (flight.getAirplaneCode() != 0 && flight.getCompany() != null && flight.getStartingPoint() != null
				&& flight.getBusinessClassPrice() != 0) {
			if (flight.getBusinessClassPrice() >= 1000) {
				flightDTO[index++] = flight;
				System.out.println("flight details are added" + flight.getCompany());
			} else {
				System.out.println("the price sholud be grater than 1000");
			}
		} else {
			System.out.println("the company, air code, bussiness code cant be ampty");
		}
	}

	public void showFlightDetails() {
		for (FlightBookingDTO flightDTO : flightDTO) {
			if (flightDTO != null) {
				System.out.println("Air plane code :"+flightDTO.getAirplaneCode() + " " + "Starting point :"+flightDTO.getStartingPoint() + " "
						+ "Destination :"+flightDTO.getDestination() + " " +"Total Seats are:"+ flightDTO.getTotalSeats() + " "
						+ "Business Class Price : "+flightDTO.getBusinessClassPrice() + " " +"Economy class price"+ flightDTO.getEconomyClassPrice());

			}
		}
		System.out.println("show all method ended");
	}

	public void searchStartingPoint(String startingPoint) {
		System.out.println("invoking searchStartingPoint");
		for (int i = 0; i < flightDTO.length; i++) {
			if (flightDTO[i] != null) {
				if (flightDTO[i].getStartingPoint().equals(startingPoint)) {

					System.out.println("The Air plane code : "+flightDTO[i].getAirplaneCode() + " " + "Starting point of plane :"+flightDTO[i].getStartingPoint() + " "
							+ "destination of plane :"+flightDTO[i].getDestination() + " " + "Total Seats are :"+flightDTO[i].getTotalSeats() + " "
							+ "Business class price"+flightDTO[i].getBusinessClassPrice() + " " + " Economy class price : "+flightDTO[i].getEconomyClassPrice());

				}
			}
		}

	}
}
