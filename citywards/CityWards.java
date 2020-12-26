package xworkz.com.xworkzapp.citywards;


public class CityWards {
	
	public CityDTO[] cd;
	public int ind;
	
	public CityWards(){
		cd=new CityDTO[3];
	}
	
	public void addCites(CityDTO cityDTO ){
		if(cityDTO!=null) {
			System.out.println(this.ind);
			this.cd[ind++]=cityDTO;
		
		}else if (cityDTO==null){
			System.out.println(" cityDTO is not available");
		}
	}
	
	public void displayCities(CityDTO cityDTO){
		for(int i=0;i<cd.length;i++)
		if(cityDTO!=null){
			System.out.println(cd[i].getWardNo() + " " + cd[i].getWardName() + " " + cd[i].getCorporatorName() + " " + cd[i].getPopulation() + " " + cd[i].getAreaInSKm());
			
		}
		else{
			System.out.println("car not available");
		}
	}
}
