package com.bit.oop5.exec;

import java.util.ArrayList;

public class ExecArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[14];

		// 클래스 배열: 최초에는 빈 배열
		// 배열 개수를 처음에는 알 수 없음

		ArrayList<String> sString = new ArrayList<String>();
		sString.add("korea");
		sString.add("한국");
		System.out.println(sString.toString());
		
		// 정수로는 원래 못 만드니깐 이렇게 인티져 클래스로 만들어야함
		ArrayList<Integer> aInt = new ArrayList<Integer>();

		// 소수 클래스로 만드록 싶을땐
		ArrayList<Float> aFloat = new ArrayList<Float>();

		// 불린 클래스로 만들때
		ArrayList<Boolean> aBoolean = new ArrayList<Boolean>();

		// 이렇게 원래 자료형인데도 클래스로 있는 것들을 wrapper class라고 함

	}

}
