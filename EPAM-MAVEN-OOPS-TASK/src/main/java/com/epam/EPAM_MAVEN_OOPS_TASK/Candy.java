package com.epam.EPAM_MAVEN_OOPS_TASK;

public abstract class Candy implements Gift{
	public abstract void setGiftInfo(String candyName,int quantity,double weight);
	public abstract void getGiftInfo();
}
