package com.bit.oop5.dto;

import java.util.ArrayList;

import com.bit.oop5.exec.Cat;

public class CatDTO {
	
	
	ArrayList<Cat> cats=new ArrayList<Cat>();
	
	public ArrayList<Cat> getCats(){
		return cats;
	}

	public void setCat(ArrayList<Cat> cats) {
		this.cats = cats;
	}

	
	
}
