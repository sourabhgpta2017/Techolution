package com.techolution.satisfactionIndex.api;

import java.util.ArrayList;
import java.util.List;

public interface IMenu {
	/*
	 * This interface is for menu which have two different lists of 
	 * 
	 *   	list satisfaction amount					list time taken
		[amount of satisfaction from eating dish ] [time taken for this dish ]
		
	 */
	
	
	/**
	 * this method is use to get the list of satisfaction amount for dish in the given menu
	 * @return satisfaction amount
	 */
	List<Integer> getSatisfactionAmount();
	/**
	 * this method is use to set the list of satisfaction amount for dish in the given menu 
	 * @param list of satisfactionAmount<Integer>
	 */
	void setSatisfactionAmount(List<Integer> satisfactionAmount);
	
	/**
	 * this method return the list of time taken for particular dish within the same sequence with satisfaction amount
	 * @return list of time taken
	 */
	List<Integer> getTimeTaken();

	/**
	 * this method set the list of time taken for particular dish within the same sequence with satisfaction amount
	 * @param timeTaken
	 */
	void setTimeTaken(List<Integer> timeTaken);
	
	
}
