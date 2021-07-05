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
	public void displayStocks() {
        for(Stocks stocks : stockList)
        {
            System.out.println(stocks);
        }
    }
	public void calculateValueOfStocks()
	{
		double totalValue=0;
		for(Stocks stock:stockList)
		{
			double valueofstock = stock.getNoOfShares()*stock.getSharePrice();
			System.out.println("value of stock"+stock.getStockNames()+"is"+valueofstock);
			totalValue = totalValue + valueofstock;
		}
		System.out.println("total stock value is:"+totalValue);
	}
}


	
