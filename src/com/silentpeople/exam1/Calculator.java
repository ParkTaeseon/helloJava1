package com.silentpeople.exam1;

import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
      
      String equs = "2*3-4="; // 입력 받은 수식
      String[] equsVar; // split 반환 배열
      char oper[]; // 연산기호 저장 배열
      char operVar[];
      int operCnt = 0; // 연산횟수측정
      int cnt = 0; // *,/ 연산횟수측정
      int result = 0; // 결과값
      int[] num; // 수식 숫자 저장배열
      int[] numVar; //
      int x = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.print("수식 : ");
      equs = input.nextLine(); // 문자열 수식 입력
      equs = equs.replace(" ",""); // 공백 제거
      equs = equs.replace("=", ""); // = 지우기

      for (int i = 0; i < equs.length(); i++) { // 연산 횟수 카운트
         if (equs.charAt(i) == '+' || equs.charAt(i) == '-')
            operCnt++;
         if (equs.charAt(i) == '*' || equs.charAt(i) == '/') {
            cnt++;
            operCnt++;
         }
      }

      oper = new char[operCnt]; // 연산기호저장배열 초기화
      operVar = new char[operCnt - cnt];
      
      for (int i = 0, j = 0; i < equs.length(); i++) // 연산기호 저장
         if (equs.charAt(i) == '+' || equs.charAt(i) == '-' || equs.charAt(i) == '*' || equs.charAt(i) == '/')
            oper[j++] = equs.charAt(i);

      equs = equs.replace("+", ":"); // |
      equs = equs.replace("-", ":"); // |
      equs = equs.replace("*", ":"); // |==> 수식의 숫자 문자열만 배열에 저장
      equs = equs.replace("/", ":"); // |
      equsVar = equs.split(":"); 	 // |

      num = new int[equsVar.length]; // 수식 숫자 저장배열 초기화
      numVar = new int[equsVar.length - cnt]; // 수식 숫자 저장배열 초기화

      for (int i = 0; i < equsVar.length; i++)
         num[i] = Integer.parseInt(equsVar[i]); // int 타입으로 변환후 배열에 저장

      for (int i = 0; i < oper.length - x; i++) { // 연산

         switch (oper[i]) {
         case '*':
            
            x++;
            result = num[i] * num[i + 1];
            for (int j = 0, k = 0; j < num.length - x; j++, k++) {
               if (j == i) {
                  num[j] = result;
                  k++;
               } else
                  num[j] = num[k];
            }
            for (int j = 0, k = 0; j < oper.length - x; j++, k++) {
               if (j == i)
                  k++;
               oper[j] = oper[k];
            }
            break;
         case '/':
            x++;
            result = num[i] / num[i + 1];
            for (int j = 0, k = 0; j < num.length - x; j++, k++) {
               if (j == i) {
                  num[j] = result;
                  k++;
               } else
                  num[j] = num[k];
            }
            for (int j = 0, k = 0; j < oper.length - x; j++, k++) {
               if (j == i)
                  k++;
               oper[j] = oper[k];
            }
            break;
         }
      }

      for (int i = 0; i < numVar.length; i++)
         numVar[i] = num[i];

      for (int i = 0; i < operVar.length; i++)
         operVar[i] = oper[i];

      result = numVar[0];
      for (int i = 0; i < operVar.length; i++) { // 연산
         switch (operVar[i]) {
         case '+':
            result += num[i + 1];
            break;
         case '-':
            result -= num[i + 1];
            break;
         }
      }
      System.out.println(result);
   }

}