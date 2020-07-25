package com.epam.EPAM_MAVEN_OOPS_TASK;

public class Chocolate extends Candy{
	String candyName;
	int quantity;
	double weight;
	double totalWeight;
	public void setGiftInfo(String candyName,int quantity,double weight) {
		this.candyName=candyName;
		this.quantity=quantity;
		this.weight=weight;
	}
	public void getGiftInfo() {
		this.totalWeight=quantity*weight;
		System.out.println("Gift contains candy "+candyName+" of type Chocolate");
		System.out.println("Total Weight of chocolate : "+totalWeight);
	}
}
