package com.silentpeople.exam1;

import java.util.Scanner;

public class Class1 {// 클래스 선언(클래스 명 : Class1)
	/*
	 * 구간 주석
	 */
	public static void main(String[] args)throws InterruptedException { // main 메소드(Main Method)

		/*
		 * byte salary = (byte) 24000000;
		 * 
		 * long salary2 = 200000000000000l; short salary3 = 32000; char name =
		 * 'a'; float ratio = (float) 1.8; float ratio2 = 1.8F; double ratio3 =
		 * 1.1234546789456123132123123128; String str1 = "HELLO"; String str2 =
		 * "trump";
		 * 
		 * System.out.println(str1.equals(str2));
		 * 
		 * System.out.printf("salary = %d\n", salary); System.out.println(10 %
		 * 3); System.out.println(ratio3);
		 * 
		 * String str = "apple"; boolean startsWith = str.startsWith("a");
		 * System.out.println("startsWith: " + startsWith);
		 * 
		 * String str1 = "test"; boolean endsWith = str1.endsWith("t");
		 * System.out.println("endsWith: " + endsWith);
		 * 
		 * String str2 = "abcdef"; int indexOf = str2.indexOf("d");
		 * System.out.println("indexOf : " + indexOf);
		 * 
		 * String str3 = "abcdef"; int length = str3.length();
		 * System.out.println("length : " + length);
		 * 
		 * String str4 = "A*B*C*D"; String replace = str4.replace("*", "-");
		 * System.out.println("replace: " + replace);
		 * 
		 * String str5 = "AB CD"; String replaceAll =
		 * str5.replaceAll("\\p{Space}", "*"); System.out.println("replaceAll: "
		 * + replaceAll);
		 * 
		 * String str6 = "A:B:C:D:abcd"; String[] split = str6.split(":"); for
		 * (int i = 0; i < 5; i++) System.out.println("split: " + split[i]);
		 * 
		 * String str7 = "ABCDEF"; String substring = str7.substring(0, 1);
		 * System.out.println("substring: " + substring);
		 * 
		 * String str8 = "abcDEF"; String toLowerCase = str8.toLowerCase();
		 * System.out.println("toLowerCase: " + toLowerCase);
		 * 
		 * String str9 = "abcDEF"; String toUpperCase = str9.toUpperCase();
		 * System.out.println("toUpperCase: " + toUpperCase);
		 * 
		 * String str10 = "1234"; String toString = str10.toString();
		 * System.out.println("toString: " + toString);
		 * 
		 * String s = "     java java java     "; String v = s.trim();
		 * System.out.println("trim:" + v);
		 * 
		 * int i = 12345; long l = 1165548911516156561L; char c = '1';
		 * System.out.println("valueOf: " + String.valueOf(i));
		 * System.out.println("valueOf: " + String.valueOf(l));
		 * System.out.println("valueOf: " + String.valueOf(c));
		 * 
		 * 
		 * int age = 5;
		 * 
		 * switch (age) {
		 * 
		 * case 1: System.out.println("1"); break; case 2:
		 * System.out.println("2"); break; case 3: System.out.println("3");
		 * break; default: System.out.println("default!!!"); break; } while(){
		 * 
		 * } do{
		 * 
		 * }while; for(;;){
		 * 
		 * }
		 * 
		 * for(int cnt = 0 ; cnt < 3 ; cnt++) System.out.println(args[cnt]);
		 * 
		 * for(String input : args){ System.out.println(input); } 향상된 for문 (for
		 * each 문)
		 * 
		 * String str; int age;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.print("이름을 입력하세요 : "); str = input.next();
		 * System.out.print("나이를 입력하세요 : "); age = input.nextInt();
		 * System.out.println("당신은 "+ age +"세의 " + str + "입니다.");
		 * 
		 * 
		 * int i = 1;
		 * 
		 * while(i!=18){ i = input.nextInt(); System.out.println(i); }
		 * System.out.println("Continue~");
		 * 
		 * int j;
		 * 
		 * do{ j = input.nextInt(); System.out.println(j); }while(j != 18);
		 * 
		 * System.out.println("The end!!");
		 * 
		 * char[][] arr = {{'0','1','2','3','4'},{'a','b','c','d','e'}};
		 * 
		 * for(int i=0; i<arr.length; i++){ for(int j=0; j<arr[i].length; j++)
		 * System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
		 * System.out.println(); }
		 * 
		 * System.out.println();
		 * 
		 * int ar [] = new int[5];
		 * 
		 * for(int i=0; i<ar.length; i++) System.out.print("ar[" + i + "] = " +
		 * ar[i]+ "\t");
		 * 
		 * System.out.println(); System.out.println();
		 * 
		 * int [][] arr ={{1,2,3},{4,5,6}}; for(int i=0; i<arr[0].length; i++)
		 * System.out.print(arr[0][i]);
		 * 
		 * 
		 * 
		 * System.out.println(); System.out.println();
		 * 
		 * String strarr[][] = new String[3][3];
		 * 
		 * for(int i=0; i<strarr.length; i++){ for(int j=0; j<strarr[i].length;
		 * j++) System.out.print("strarr[" + i + "][" + j + "] = " +
		 * strarr[i][j] + "\t"); System.out.println(); }
		 */
		// int num1 , num2;
		// int ret;
		// double ret2;
		//
		// num1 = 5;
		// num2 = 2;
		//
		// ret = add(num1,num2);
		// System.out.println(num1 + " + " + num2 + " = " + ret);
		//
		// ret = sub(num1, num2);
		// System.out.println(num1 + " - " + num2 + " = " + ret);
		//
		// mul(num1, num2);
		//
		// ret2 = div(num1, num2);
		// System.out.println(num1 + " / " + num2 + " = " + ret2);
		
//		int exit = 1;
//		do {
//			System.out.print("이름을 뽑을 명수 (최대 5명) : ");
//
//			Scanner input = new Scanner(System.in);
//			int cnt;
//			cnt = input.nextInt();
			
//			try{
//			Thread.sleep(4000);
//			}
//			catch(InterruptedException e){
//				System.out.println("InterruptedException가 발생했습니다ㅜㅜ");
//			}
//			finally{
//				System.out.println("정상실행됨");
//			}
			
//			Thread.sleep(4000);
//
//			if (cnt > 5 || cnt < 1) {
//				System.out.print("범위 넘어감");
//				exit = 0;
//			} else {
//				String[] name = nameOut(cnt);
//
//				for (String out : name)
//					System.out.print(out + "  ");
//			}
//			System.out.println();
//		} while (exit != 0);
//		System.out.println("종료 !");
		int y = 10;
		double x = 1.0;
		
		System.out.println(x/y);
			
	}

	public static int add(int num1, int num2) {

		int result;

		result = num1 + num2;
		return result;
	}
	public static int sub(int num1, int num2) {

		int result = num1 - num2;

		return result;
	}
	public static void mul(int num1, int num2) {

		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		return;

	}
	public static double div(int num1, int num2) {

		return (double) num1 / (double) num2;
	}
	
	public static String[] nameOut(int cnt) {
		String[] name = { "하하", "호호", "히히", "헤헤", "흑흑" };
		String[] outName = new String[cnt];

		for (int i = 0; i < cnt; i++) {
			outName[i] = name[i];
		}
		return outName;
	}
}
