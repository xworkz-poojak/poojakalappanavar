package com.xworkz.lib.dao;

import java.util.List;

import com.xworkz.lib.entity.CoupounEntity;

public interface CoupounDAO {
	
	public void create(CoupounEntity entity);
	
	public void create(List<CoupounEntity> entities);
	
	public void updateValidateInMonthAndCodeById(int id,int validateInMonths,int code);
	
	public void getById(int id);
	
	public List<CoupounEntity> getAll();
	
	public void deleteAll();

}
