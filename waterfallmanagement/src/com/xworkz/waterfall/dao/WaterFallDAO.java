package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;

public interface WaterFallDAO {

	public void create(WaterFallEntity entity);

	public void deleteById(int id);

	public void updateHeightAndDepthById(int id, double height, double depth);

	public WaterFallEntity getById(int id);
	
	public void create(WaterFallEntity entity,StateEntity stateEntity);
}
