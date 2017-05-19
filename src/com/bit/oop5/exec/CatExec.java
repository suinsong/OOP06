package com.bit.oop5.exec;

import com.bit.oop5.dto.CatDTO;

public class CatExec {

	public static void main(String[] args){
	
		
		CatDTO cats=new CatDTO();
		Cat cat;
		
		//방법 1
		cat=new Cat();
		cat.setStrName("샴");
		cats.getCats().add(cat);
		
		System.out.println(cat.toString());
		System.out.println();
		
		
		//방법 2
		cat=new Cat("페르시안",10);
		cats.getCats().add(cat);
		
		//방법3
		cats.getCats().add(new Cat("뱅골",5));
		cats.getCats().add(new Cat("미미",1));
		cats.getCats().add(new Cat("레드들",3));
		cats.getCats().add(new Cat("메인쿤",4));
		cats.getCats().add(new Cat("길고양이",6));
		
		
		System.out.println(cats.toString());
		
		
	}
}
