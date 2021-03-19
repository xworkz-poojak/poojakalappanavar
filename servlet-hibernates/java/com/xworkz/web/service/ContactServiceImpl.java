package com.xworkz.web.service;

import com.xworkz.web.entity.ContactEntity;

public class ContactServiceImpl implements ContactService{

	public ContactServiceImpl() {
		
		System.out.println("created ContactServiceImpl");
	}
	
	
	@Override
	public boolean validateAndSave(ContactEntity entity) {
		ContactEntity contactEntity=entity;
		boolean valid=false;
		String name=contactEntity.getName();
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<25 ){
			System.out.println("name is valid");
			valid=true;
		}else{
			System.out.println(" name not valid");
			valid=false;
		}
		
		
		if(valid){
		String email=contactEntity.getEmail();
		if(email!=null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")){
			System.out.println("Email is valid");
			valid=true;
		}else{
			System.out.println("Email is not valid");
		    valid=false;
		}
		
		
		if(valid){
			String company=contactEntity.getCompany();
			if(company!=null && !company.isEmpty() && company.length()>3 && company.length()<25 ){
				System.out.println("company is valid");
				valid=true;
			}else{
				System.out.println(" company not valid");
				valid=false;
			}
			
			if(valid){
				String no=contactEntity.getNo();
				if(no!=null && no.length()==10){
					System.out.println("phono is valid");
					valid=true;
				}else{
					System.out.println("phone no is not valid");
					valid=false;
				}
			}
			
		}
		
		}
		
		return valid;
	}

}
