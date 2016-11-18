package com.silentpeople.exam1;

public class TestClass {
	
	String name;
	int age;
	
	
	public TestClass(){			// default 생성자
		name = "Park Tae Seon";
		age = 26;
	}
	public TestClass(String name, int age ){
		this.name = name;
		this.age = age;
	}
	
	public void output(){
		System.out.println(name + "  " + age + "세");
	}

	public void printAge(){
		System.out.println(age);
	}
	public void printName(){
		System.out.println(name);
	}
	
	

	
	

}
