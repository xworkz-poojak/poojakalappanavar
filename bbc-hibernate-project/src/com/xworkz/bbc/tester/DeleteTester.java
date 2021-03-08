package com.xworkz.bbc.tester;

import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class DeleteTester {
public static void main(String[] args) {
	new BBCDAOImpl().deletById(3);
}
}
