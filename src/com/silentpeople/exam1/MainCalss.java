package com.silentpeople.exam1;

import java.util.Scanner;

public class MainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TestClass tclass1;			//객체(Object) 생성
//		tclass1 = new TestClass();	//인스턴스(Instance) 생성
		TestClass tclass1 = new TestClass("홍길동", 0); // 초기화하면서 인스턴스 생성
		
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		tclass1.age = age;
		tclass1.printAge();
		
		/*if(){	//조건 : age 변수에 숫자가 들어오면
			tclass1.age = age;
		}
		tclass1.printAge();
		*/
		
		
		
		
		
		

	

	}

}
