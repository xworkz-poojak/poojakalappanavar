package xworkz.com.xworkzapp;

public class Hotel {
	
	public HotelDTO[] hotel;
	public int index;
	
	public Hotel(int size){
		hotel=new HotelDTO[size];
	}
	
	public void addHotelInformation(HotelDTO dto){
		if(dto.getHotelName()!=null && dto.getLocation()!=null && dto.getFooditems()!=null ){
			hotel[index++]=dto;
			System.out.println("Hotel information are added");
		}else {
			System.out.println("Hotel information are not added");
		}
	}

	
	public void displayAllHotelInformation(){
		System.out.println("the information of hotel is:");
		for (int i = 0; i < hotel.length; i++) {
			if(hotel!=null){
				System.out.println("The hotel name is :"+hotel[i].getHotelName()+ " "+"The location of hotel is :"+ hotel[i].getLocation()+ " "+"Hotel owner name is :"+ hotel[i].getOwnerName()+ " "+"Type is :"+ hotel[i].getType()+ " "+ "Fooditems is :"+hotel[i].getFooditems());
			}else if(hotel==null){
				System.out.println("Hotel information are not added");
			}
			
		}
	}
	
	
	public void toSearchHotels(Location location , String hotelName){
	
		//boolean point=false;
		for (int i = 0; i < hotel.length; i++) {
			if(hotel!=null){
				System.out.println("inside if");
				if(hotel[i].getLocation().equals(location) && hotel[i].getHotelName().equals(hotelName)){
					System.out.println(hotel[i].getHotelName()+ " " + hotel[i].getLocation()+ " "+ hotel[i].getOwnerName()+ " " +hotel[i].getType()+ " "+ hotel[i].getFooditems());
				System.out.println("outside if");
				}//else{
					//point=false;
				//}
			else{
			System.out.println("hotel is not present");
			}
			//System.out.println("hotel is not present");
		}
		}
		
	}


	public HotelDTO returnOwnerNameByHotelName(String hotelName){
	HotelDTO dto=null;
	for (int i = 0; i < hotel.length; i++) {
		if(hotel[i]!=null)
			if(hotel[i].getHotelName().equals(hotelName)){
				//System.out.println("hotel name is:"+hotel[i].getHotelName()+ "  " +" hotel location is:"+ hotel[i].getLocation()+ " "+ "hotel ownerName :"+hotel[i].getOwnerName()+ " "+"hotel type:" +hotel[i].getType()+ " "+"food items are :" +hotel[i].getFooditems());
			System.out.println("hotel owner is :"+hotel[i].getOwnerName());
			}
	}
		return dto;
	}


}
