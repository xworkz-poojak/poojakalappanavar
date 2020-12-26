package xworkz.com.xworkzapp.citywards.util;

import java.util.Scanner;

import xworkz.com.xworkzapp.citywards.CityDTO;

public class CityTester {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
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
		dto.setAreaInSKm(areaInSKm);
		
		
		}

}
