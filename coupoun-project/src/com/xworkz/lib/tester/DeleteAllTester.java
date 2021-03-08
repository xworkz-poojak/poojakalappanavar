package com.xworkz.lib.tester;

import com.xworkz.lib.dao.CoupounDAOImpl;

public class DeleteAllTester {
public static void main(String[] args) {
	new CoupounDAOImpl().deleteAll();
	System.out.println("deleted successfully");
}
}
