package com.xworkz.bbc.dao;

import com.xworkz.bbc.entity.BBCEntity;

public interface BBCDAO {

	public void create(BBCEntity entity);

	public BBCEntity getById(int id);

	public BBCEntity updateNoOfTaskAndDaysInById(int id, int noOfTasks, int daysIn);
	
	public void deletById(int id);

}
