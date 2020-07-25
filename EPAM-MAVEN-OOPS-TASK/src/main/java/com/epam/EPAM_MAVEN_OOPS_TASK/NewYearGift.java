package com.epam.EPAM_MAVEN_OOPS_TASK;

public class NewYearGift {

	public static void main(String[] args) {

		double totalGiftWeight=0;
		
		Chocolate chocolate;
		
		// Gift -> Candy -> Chocolate -> DairyMilk
		
		chocolate=new Chocolate();
		chocolate.setGiftInfo("DairyMilk", 4, 9.75);
		chocolate.getGiftInfo();
		totalGiftWeight+=chocolate.totalWeight;
		System.out.println();
		
		// Gift -> Candy -> Chocolate -> DairyMilk
		
		chocolate=new Chocolate();
		chocolate.setGiftInfo("Kitkat", 4, 10.5);
		chocolate.getGiftInfo();
		totalGiftWeight+=chocolate.totalWeight;
		System.out.println();
		
		Sweet sweet;
		
		// Gift -> Candy -> Sweet -> Khaja
		
		sweet=new Sweet();
		sweet.setGiftInfo("Khaja", 20, 5.8);
		sweet.getGiftInfo();
		totalGiftWeight+=sweet.totalWeight;
		System.out.println();
		
		// Gift -> Candy -> Sweet -> Kova
		
		sweet=new Sweet();
		sweet.setGiftInfo("Kova", 10, 6.7);
		sweet.getGiftInfo();
		totalGiftWeight+=sweet.totalWeight;
		System.out.println();
		
		
		System.out.println("Total Weight of the gift : "+totalGiftWeight);
	}
}
