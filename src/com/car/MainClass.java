package com.car;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Input Value : ");
			String controlValue = input.nextLine(); // 衛翕高: 學撚高:粽溯檜觼高
													// 0:0~100:0~100
			String[] values = controlValue.split(":");

			int sidongVal = Integer.parseInt(values[0]);
			int accelVal = Integer.parseInt(values[1]);

			
				Sidong sidong1 = new Sidong();
				sidong1.engineStartStop(sidongVal);
			
		}
	}
}
