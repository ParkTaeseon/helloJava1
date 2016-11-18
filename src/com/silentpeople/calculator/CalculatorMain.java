package com.silentpeople.calculator;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		String inputVal;
		boolean minusYn;
		boolean yesno = true;
		do {
			System.out.println("Input:");
			Scanner scan = new Scanner(System.in);
			inputVal = scan.nextLine();

			inputVal = inputValCheck(inputVal);

			if (startWithNotNumeric(inputVal)) {
				System.out.println("������ �Էµ����ʽ��ϴ�.");
				continue;
			}
			
			String[] splitValues = stringNumeric(inputVal);

			int [] num = StringArrToIntegerArr(splitValues);

			char sign = popSign(inputVal);	// ��ȣ

			if(blockDivideByZero(sign,num[1]))	//0������ ����ó��
				continue;

			long result = 0;
			double result2 = 0.0;
			switch (sign) {
			case '+':
				result = (long) num[0] + (long) num[1];
				System.out.println(result);
				break;
			case '-':
				result = (long) num[0] - (long) num[1];
				System.out.println(result);
				break;
			case '*':
				result = (long) num[0] * (long) num[1];
				System.out.println(result);
				break;
			case '/':
				result2 = (double) num[0] / (double) num[1];
				System.out.println(result2);
				break;
			default:
				break;
			}
			System.out.println("yes(y) or no(n)");
			inputVal = scan.nextLine();

			switch (inputVal) {
			case "y":
				yesno = true;
				continue;
			case "n":
				yesno = false;
				break;
			case "Y":
				yesno = true;
				continue;
			case "N":
				yesno = false;
				break;
			default:
				break;
			}

		} while (yesno);
		System.out.println("����Ǿ����ϴ�.");
	}

	public static String inputValCheck(String inputVal) {

		inputVal = inputVal.replace(" ", "");

		return inputVal;

	}
	public static boolean startWithNotNumeric(String inputVal){
		boolean a1 = inputVal.startsWith("-");
		return a1;
	}
	public static String[] stringNumeric(String inputVal){
		String [] a1 = inputVal.split("[\\+\\-\\*\\/\\=]");
		return a1;
	}
	public static int [] StringArrToIntegerArr(String[] splitValues){
		int num [] = new int[10];
		for (int cnt = 0; cnt < splitValues.length; cnt++) {
			try {
				num[cnt] = Integer.parseInt(splitValues[cnt]);
			} catch (java.lang.NumberFormatException e) {
				System.out.println("�Է¹��� �ʰ�: -2147483648~2147483647");
			}
		}
		return num;
	}
	public static char popSign(String inputVal){	
		String[] signArray = { "+", "-", "*", "/" };
		char sign = ' ';
		for (int cnt = 0; cnt < signArray.length; cnt++) {
			int signOrder = inputVal.indexOf(signArray[cnt]);
			if (signOrder < 0) {
				continue;
			}
			sign = inputVal.charAt(signOrder);
		}
		return sign;
	}
	public static boolean blockDivideByZero(char sign , int num){ 
		if (num == 0 && sign == '/') {
			System.out.println("0���� ������� �Ұ����մϴ�. �ٽ� �Է����ּ���!!");
			return true;	// true : 0������  
		}
		else 
			return false;	// false : 0������ƴ�
	}
}