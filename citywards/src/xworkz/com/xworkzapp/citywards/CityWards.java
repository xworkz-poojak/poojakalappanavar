package xworkz.com.xworkzapp.citywards;


public class CityWards {
	
	public CityDTO[] cd;
	public int ind;
	
	public CityWards(int size){
		cd=new CityDTO[size];
	}
	
	public void addCites(CityDTO cityDTO ){
		if(cityDTO.getWardName()!=null && cityDTO.getWardNo()!=null && cityDTO.getPopulation()>5000) {
			//System.out.println(this.ind);
			this.cd[ind++]=cityDTO;
			System.out.println("car details are added");
		
		}else if (cityDTO==null){
			System.out.println(" cityDTO is not available");
		}
	}
	
	public void displayCities(){
		System.out.println("displayimg car details :");
		for(int i=0;i<cd.length;i++){
		if(cd!=null){
			System.out.println("The ward no  :"+cd[i].getWardNo() + " " + "The ward name :"+cd[i].getWardName() + " " +"The corporator name :"+ cd[i].getCorporatorName() + " " + "The population :"+cd[i].getPopulation() + " " + "Area :"+cd[i].getAreaInSKm());
			
		}
		else{
			System.out.println("car not available");
		}
	}
	}

public void searchCityByWardNo(String wardNo){
for (int i = 0; i < cd.length; i++) {
	if(cd!=null){
		if(cd[i].getWardNo().equals(wardNo)){
			System.out.println("The wardname :"+cd[i].getWardName()+ " "+ "The ward no :"+cd[i].getWardNo()+ " "+ "Population :"+cd[i].getPopulation()+ " "+ "corporator :"+cd[i].getCorporatorName()+ " "+"Area :"+ cd[i].getAreaInSKm());
		//System.out.println(cd[i].getWardNo());
		System.out.println("cityward found");
		}
	
		else{
			System.out.println("city not available");
		}
		
		
	}
	
}
	
}
public CityDTO returnCorporatorByWardNo(String wardNumber){
	CityDTO dto=null;
	
	for (int i = 0; i < cd.length; i++) {
		if(cd[i]!=null){
			//dto=cityDTO[i];
			if(cd[i].getWardNo().equals(wardNumber)){
				//System.out.println(cd[i].getCorporatorName());
			//	System.out.println(cd[i].getWardName()+ " "+ cd[i].getWardNo()+ " "+ cd[i].getPopulation()+ " "+ cd[i].getCorporatorName()+ " "+ cd[i].getAreaInSKm());
			System.out.println("The corporator name :"+cd[i].getCorporatorName());
			
			}
		}
		
	}
	return dto;
			
}



}


