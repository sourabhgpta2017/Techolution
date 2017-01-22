package com.techolution.satisfactionIndex.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.techolution.satisfactionIndex.api.ICalculateSatisfactionIndex;
import com.techolution.satisfactionIndex.api.ICustomer;
import com.techolution.satisfactionIndex.api.IMenu;

public class CalculateSatisfactionIndex implements ICalculateSatisfactionIndex {

	protected IMenu menu;
	
	protected ICustomer customer;

	
	public CalculateSatisfactionIndex(IMenu menu,ICustomer customer) {
		super();
		this.menu = menu;
		this.customer = customer;
	}
	

	@Override
	public void setTimeTakenAndSatisfactionAmount(){
		String sCurrentLine = null;
		List<Integer> timeTaken = new ArrayList<>();
	    List<Integer> satisfaction = new ArrayList<>();
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("src/data.txt"));
			String[] ss = null;
			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				ss = sCurrentLine.split(" ");
				timeTaken.add(Integer.parseInt(ss[1]));
				satisfaction.add(Integer.parseInt(ss[0]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		menu.setSatisfactionAmount(satisfaction);
		menu.setTimeTaken(timeTaken);
	}
	
	@Override
	public int calculateMaxSatisfactionIndex(){
		int totalTime = customer.getTotaltime();
		int sAmount = menu.getSatisfactionAmount().size();;
		
		int[][] k = new int[sAmount+1][totalTime+1];
		
		
		for(int i = 0; i <= sAmount; i++){
			for(int j = 0; j <= totalTime; j++){
				if(i == 0 || j ==  0){
					k[i][j] = 0;
					continue;
				}
				if(0 <= (j - menu.getTimeTaken().get(i-1))){
					k[i][j] = Math.max(k[i-1][j], k[i-1][j - menu.getTimeTaken().get(i-1)] + menu.getSatisfactionAmount().get(i-1));
				}
				else{
                    k[i][j] = k[i-1][j];
                    
                }
			}
		}
		return k[menu.getTimeTaken().size()] [totalTime];
		
	}
	
}


