problem:

	 Gordon Ramsey, a very smart guy, like seating food. Now, Gordon is at a restaurant and he has many
	 different types of food to choose from. Gordon gets x amount of satisfaction and requires y amount 
	 of time to eat an item from the menu. Given t minutes, write a java program that reads the text file 
	 and ﬁnds out the maximum satisfaction that Gordon can get from eating at the restaurant. You will be 
	 given a text file with the following format:
	 
		[t][Number of items on menu]
		[amount of satisfaction from eating dish 1][time taken for dish 1]
		[amount of satisfaction from dish 2][time taken for dish 2]
		
		
	project Description.
	
	I have created a simple java application to solve the given problem in following way..
	
	
	Menu-->	I have created a Menu were I took two list one for Satisfaction index and other for time taken
	and assign values in it from a given text file in same order.
	
	Customer--> I have created customer class and took customer name and total time customer has
	to eat.
	
	CalculateSatisfactionIndex--> In this class i have mainly two methods one is used to read the data from 
	given text file, and other one is used to calculate maximum amount of satisfaction index.
	
	Calculation-->
	To get the maximum satisfaction index from eating I use  0/1 knapsack algorithm which check all the possible	
	amount of satisfaction in given time interval and return the maximum one.
	
	How to run the Application-->
	To run the application run the test class as a java application
	and pass the total time in integer form for which you have to eat in the console and this program will 
	give an output of maximum amount of satisfaction you have after eating.
		