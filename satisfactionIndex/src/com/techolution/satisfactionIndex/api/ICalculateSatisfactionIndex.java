package com.techolution.satisfactionIndex.api;

public interface ICalculateSatisfactionIndex {

	/**
	 * this method is use to read the data from given data file of menu
	 * and assign the  value of  satisfaction amount and time taken to eat each dishes to the list in the IMenu.java
	 */
	
	void setTimeTakenAndSatisfactionAmount();
	
	/**
	 * this method is based on 0/1 knapsack algorithm
	 * which is used to get the maximum amount of satisfaction after eating the dish within the given time
	 * @return int amount of satisfaction
	 */
	int calculateMaxSatisfactionIndex();

}