package com.silentpeople.exam1;

import java.util.Scanner;

public class MainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TestClass tclass1;			//��ü(Object) ����
//		tclass1 = new TestClass();	//�ν��Ͻ�(Instance) ����
		TestClass tclass1 = new TestClass("ȫ�浿", 0); // �ʱ�ȭ�ϸ鼭 �ν��Ͻ� ����
		
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		tclass1.age = age;
		tclass1.printAge();
		
		/*if(){	//���� : age ������ ���ڰ� ������
			tclass1.age = age;
		}
		tclass1.printAge();
		*/
		
		
		
		
		
		

	

	}

}
