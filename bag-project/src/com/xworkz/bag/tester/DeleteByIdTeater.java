package com.xworkz.bag.tester;

import com.xworkz.bag.dao.BagDAOImpl;

public class DeleteByIdTeater {
public static void main(String[] args) {
	new BagDAOImpl().deleteById(1);
	System.out.println("deleted");
}
}
