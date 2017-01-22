package com.techolution.satisfactionIndex.impl;

import com.techolution.satisfactionIndex.api.ICustomer;

public class Customer implements ICustomer   {

	

	private String Name;
	
	private int Totaltime;
	
	public Customer() {
		Name="Gordon Ramsey" ;
		
	}
	
	@Override
	public int getTotaltime() {
		return Totaltime;
	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public void setName(String name) {
		Name = name;
	}

	@Override
	public void setTotaltime(int totaltime) {
		Totaltime = totaltime;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", Totaltime=" + Totaltime + "]";
	}

}
