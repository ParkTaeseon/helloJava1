package com.silentpeople.exam1;

public class TestClass {
	
	String name;
	int age;
	
	
	public TestClass(){			// default ������
		name = "Park Tae Seon";
		age = 26;
	}
	public TestClass(String name, int age ){
		this.name = name;
		this.age = age;
	}
	
	public void output(){
		System.out.println(name + "  " + age + "��");
	}

	public void printAge(){
		System.out.println(age);
	}
	public void printName(){
		System.out.println(name);
	}
	
	

	
	

}
