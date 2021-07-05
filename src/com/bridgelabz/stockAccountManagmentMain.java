package com.bridgelabz;

import java.util.Scanner;

public class stockAccountManagmentMain {
   public static void main(String[] args) 
   {
	stockAccountManagmentService stockService = new stockAccountManagmentServiceimpl();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("welcome to stock account managment system");
	System.out.println("enter the no of stocks you want to add: ");
	int numOfStocks = scanner.nextInt();
	
	for(int index = 0; index < numOfStocks; index++)
	{
		Stocks newStock = new Stocks();
		System.out.println("enter the stock name");
		newStock.setStockNames(scanner.next());
		System.out.println("enter the no of shares");
		newStock.setNoOfShares(scanner.nextDouble());
		System.out.println("enter the share price");
		newStock.setSharePrice(scanner.nextDouble());
		stockService.addStocks(newStock);
	}
	stockService.getStockDetails();
	scanner.close();
    }
}
