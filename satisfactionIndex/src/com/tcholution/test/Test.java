package com.tcholution.test;

import java.util.Scanner;

import com.techolution.satisfactionIndex.api.ICalculateSatisfactionIndex;
import com.techolution.satisfactionIndex.api.ICustomer;
import com.techolution.satisfactionIndex.api.IMenu;
import com.techolution.satisfactionIndex.impl.CalculateSatisfactionIndex;
import com.techolution.satisfactionIndex.impl.Customer;
import com.techolution.satisfactionIndex.impl.Menu;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total time have to eat dish'es ");
		int totalTime = scanner.nextInt();
		
		IMenu menu = new Menu();
		ICustomer customer = new Customer(totalTime);
		
		ICalculateSatisfactionIndex cSI = new CalculateSatisfactionIndex(menu,customer);
		
		cSI.setTimeTakenAndSatisfactionAmount();
		int result = cSI.calculateMaxSatisfactionIndex();
		System.out.println("Maximum satisfaction amount to eat dishes in "+ totalTime + " minute is "+result);

	}

}
