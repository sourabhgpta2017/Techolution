package com.techolution.satisfactionIndex.api;

public interface ICustomer {

	/*
	 * This customer within total time wants to have maximum satisfaction on eating the given menu dishes
	 */
	
	/**
	 * this method return the total time customer have to eat the dish/dishes
	 * @return
	 */
	int getTotaltime();

	/**
	 * this method set the total time customer have to eat the dish/dishes
	 * @param totaltime
	 */
	void setTotaltime(int totaltime);
	
	String getName();

	void setName(String name);

}