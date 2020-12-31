package xworkz.com.xworkzapp.util;

import xworkz.com.xworkzapp.Hotel;
import xworkz.com.xworkzapp.HotelDTO;
import xworkz.com.xworkzapp.Location;

public class HotelUtil {

public static void main(String[] args) {
	Hotel hotel=new Hotel(2);
	HotelDTO hotelOne=new HotelDTO();
	hotelOne.setHotelName("Halli Mane");
	hotelOne.setLocation(Location.VIJAYNAGAR);
	hotelOne.setOwnerName("Halli");
	hotelOne.setType("veg");
	hotelOne.setService(true);
	hotelOne.setFooditems("gobi,ice,chocolate");
	
	hotel.addHotelInformation(hotelOne);
	
	//hotel.displayAllHotelInformation();
	
	HotelDTO hotelTwo = new HotelDTO();
	hotelTwo.setHotelName("uttada mane");
	hotelTwo.setLocation(Location.NAVARANGA);
	hotelTwo.setOwnerName("mane");
	hotelTwo.setType("non veg");
	hotelTwo.setService(false);
	hotelTwo.setFooditems("curdrice,palav");
	
	hotel.addHotelInformation(hotelTwo);
	hotel.displayAllHotelInformation();
	
	hotel.toSearchHotels(Location.VIJAYNAGAR, "Halli Mane");
	
	hotel. returnOwnerNameByHotelName("uttada mane");
	
	
}
}
