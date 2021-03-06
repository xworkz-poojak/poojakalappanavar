package com.xworkz.bag.dao;

import java.util.List;

import com.xworkz.bag.entity.BagEntity;

public interface BagDAO {
public BagEntity create(BagEntity entity);

public void create(List<BagEntity> entity);

public void updateBrandAndColourById(int id,String brand,String colour);

public void getById(int id);

public List<BagEntity> getAll();

public void deleteById(int id);

public void deleteAll();
}
