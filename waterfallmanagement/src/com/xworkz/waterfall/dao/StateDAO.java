package com.xworkz.waterfall.dao;

import java.util.List;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;

public interface StateDAO {

	public void create(WaterFallEntity entity,StateEntity stateEntity);
	public void create(List<StateEntity> entites);

}
