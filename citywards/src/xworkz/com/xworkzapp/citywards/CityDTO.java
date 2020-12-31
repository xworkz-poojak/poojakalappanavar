package xworkz.com.xworkzapp.citywards;

public class CityDTO {
	
     private String wardNo;
     private WardName wardName;
     private String corporatorName;
     private double population;
     private double areaInSKm;
	
     public String getWardNo() {
		return wardNo;
	}
	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}
	public WardName getWardName() {
		return wardName;
	}
	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}
	public String getCorporatorName() {
		return corporatorName;
	}
	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public double getAreaInSKm() {
		return areaInSKm;
	}
	public void setAreaInSKm(double areaInSKm) {
		this.areaInSKm = areaInSKm;
	}
     
}
