package com.bit.oop5.parents;

import com.bit.oop5.exec.Cat;
import com.bit.oop5.exec.Dog;

public class AnimalExec {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		//여기는 상속도 안 받고 패키지도 달라서 직접 접근 불가
//		dog.strName="허스키"
		
//		그래서 이렇게 셋터와 겟터를 이용해서 접근함
		dog.setStrName("허스키");
		
		
		dog.run();
		dog.setStrName("강아지");
		dog.run();
		
		Cat cat1= new Cat();//슈퍼 생성자 호출
		cat1 = new Cat("미미", 10);//멤버초기화
		cat.run();
		cat1.run();
		

	}
}
