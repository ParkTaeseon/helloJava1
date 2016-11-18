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
				System.out.println("음수는 입력되지않습니다.");
				continue;
			}
			
			String[] splitValues = stringNumeric(inputVal);

			int [] num = StringArrToIntegerArr(splitValues);

			char sign = popSign(inputVal);	// 기호

			if(blockDivideByZero(sign,num[1]))	//0나누기 예외처리
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
		System.out.println("종료되었습니다.");
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
				System.out.println("입력범위 초과: -2147483648~2147483647");
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
			System.out.println("0으로 나누기는 불가능합니다. 다시 입력해주세요!!");
			return true;	// true : 0나누기  
		}
		else 
			return false;	// false : 0나누기아님
	}
}