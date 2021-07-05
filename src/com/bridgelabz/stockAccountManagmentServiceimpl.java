package com.bridgelabz;

import java.util.LinkedList;

public class stockAccountManagmentServiceimpl implements stockAccountManagmentService

{
    LinkedList<Stocks> stockList = new LinkedList<>();
	@Override
	public void addStocks(Stocks stock) 
	{
		if(stockList.contains(stock))
		{
		System.err.println("stock managment items exist");
	    }
		else
		{
			stockList.add(stock);
		}
    }
	
	public void getStockDetails()
	{
		for(Stocks stock:stockList)
		{
			System.out.println(stock);
		}
	}
}		
	
