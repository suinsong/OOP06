package com.bit.oop5.exec;

public class Animals {

	
	//멤버변수
	protected String strName; 
	protected int intAge;
	
	
	
	public String getStrName() {
		return strName;
	}


	public void setStrName(String strName) {
		this.strName = strName;
	}


	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}


	public void run(){
		System.out.println(strName+"이 달립니다");
	}
	
	
	public void eat(){
		
		System.out.println(strName+"이 먹습니다");
	}


	public int getIntAge() {
		return intAge;
	}


}
