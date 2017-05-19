package com.bit.oop5.exec;

public class Cat extends Animals {

	// 매개변수가 없는 생성자 : super생성자
	public Cat() {
		 strName="페르시안";

//		setStrName("페르시안");

	}

	public Cat(String strName, int intAge){
		this.strName=strName;
		this.intAge=intAge;
		
		
	}

	@Override
	public String toString() {
		return "Cat [strName=" + strName + ", intAge=" + intAge + "]";
	}
}
