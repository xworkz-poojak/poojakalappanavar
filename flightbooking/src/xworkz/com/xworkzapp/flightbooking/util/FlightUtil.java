package xworkz.com.xworkzapp.flightbooking.util;

import xworkz.com.xworkzapp.flightbooking.Company;
import xworkz.com.xworkzapp.flightbooking.FlightBooking;
import xworkz.com.xworkzapp.flightbooking.FlightBookingDTO;

public class FlightUtil {
	public static void main(String[] args) {
		FlightBooking flight = new FlightBooking(4);
		FlightBookingDTO flightOne = new FlightBookingDTO();
		flightOne.setAirplaneCode(125478);
		flightOne.setCompany(Company.INDIAAIRWAYS);
		flightOne.setStartingPoint("bangalore");
		flightOne.setDestination("blly");
		flightOne.setTotalSeats(100);
		flightOne.setDomestic(true);
		flightOne.setBusinessClassPrice(1100.00);
		flightOne.setEconomyClassPrice(500);
		flight.addFlightDetails(flightOne);

		FlightBookingDTO flightTwo = new FlightBookingDTO();

		flightTwo.setAirplaneCode(2587);
		flightTwo.setCompany(Company.INDIGO);
		flightTwo.setStartingPoint("Delhi");
		flightTwo.setDestination("mysore");
		flightTwo.setTotalSeats(500);
		flightTwo.setDomestic(true);
		flightTwo.setBusinessClassPrice(2000.00);
		flightTwo.setEconomyClassPrice(400.00);
		flight.addFlightDetails(flightTwo);

		flight.showFlightDetails();

		flight.searchStartingPoint("bangalore");

	}

}
