package com.techolution.satisfactionIndex.impl;

import java.util.ArrayList;
import java.util.List;

import com.techolution.satisfactionIndex.api.IMenu;

public class Menu implements IMenu  {

	private List<Integer> satisfactionAmount;
	
	private List<Integer> timeTaken;

	
	@Override
	public List<Integer> getSatisfactionAmount() {
		return satisfactionAmount;
	}

	
	@Override
	public void setSatisfactionAmount(List<Integer> satisfactionAmount) {
		this.satisfactionAmount = satisfactionAmount;
	}

	
	@Override
	public List<Integer> getTimeTaken() {
		return timeTaken;
	}

	@Override
	public void setTimeTaken(List<Integer> timeTaken) {
		this.timeTaken = timeTaken;
	}

	@Override
	public String toString() {
		return "Menu [satisfactionAmount=" + satisfactionAmount + ", timeTaken=" + timeTaken + "]";
	}

}
