package xworkz.com.xworkzapp.citywards.util;

import java.util.Scanner;

import xworkz.com.xworkzapp.citywards.CityDTO;
import xworkz.com.xworkzapp.citywards.CityWards;
import xworkz.com.xworkzapp.citywards.WardName;

public class CityTester {
	
	public static void main(String[] args) {
		CityWards city=new CityWards(2);
		
		CityDTO c=new CityDTO();
		c.setWardName(WardName.MGROAD);
		c.setPopulation(50000);
		c.setWardNo("52S");
		c.setCorporatorName("xyz");
		c.setAreaInSKm(525);
		
		city.addCites(c);
		
		CityDTO c1=new CityDTO();
		c1.setWardName(WardName.NAVARANGA);
		c1.setPopulation(60000);
		c1.setWardNo("541");
		c1.setCorporatorName("mno");
		c1.setAreaInSKm(456);
		
		city.addCites(c1);
		
		city.displayCities();
		
		city.searchCityByWardNo("541");
		
		city.returnCorporatorByWardNo("541");
		
		
		
		
		
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		CityDTO dto=new CityDTO();
		System.out.println("enter the wardNo");
		String wardNo=sc.next();
		System.out.println("enter the wardName");
		String wardName=sc.next();
		System.out.println("enter the corporatorName");
		String corporatorName=sc.next();
		System.out.println("popuation");
		double population=sc.nextDouble();
		System.out.println("enter the areaInSKm");
		double areaInSKm=sc.nextDouble();
		
		
		dto.setWardNo(wardNo);
		dto.setWardName(wardName);
		dto.setCorporatorName(corporatorName);
		dto.setPopulation(population);
		dto.setAreaInSKm(areaInSKm); */
		
		
		}

}
