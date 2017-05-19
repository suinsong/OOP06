package com.bit.oop5.exec;

import java.util.ArrayList;

public class ClassToString {

	public static void main(String[] args) {

		System.out.println("korea");
		System.out.println("korea".toString());

		System.out.println();
		System.out.println();

		String[] sk = new String[2];
		sk[0] = "korea";
		sk[1] = "대한민국";

		for (int i = 0; i < sk.length; i++) {
			System.out.println(sk[i]);
		}
		System.out.println(sk.toString());// 번지보여줌

		System.out.println();

		ArrayList<String> sk2 = new ArrayList<String>();
		sk2.add("korea");
		sk2.add("대한민국");

		System.out.println(sk2.toString());// 하지만 얘는 값을 보여줌 그래서 더 편해서 좋음
											// 그래서 ArrayList배열을 만들어서 하는게 좋음

		
		System.out.println();
		for (int i = 0; i < sk2.size(); i++) {
			System.out.println(sk2.get(i).toString());
		}
	}

}
