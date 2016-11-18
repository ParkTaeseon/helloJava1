package com.silentpeople.exam1;

import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
      
      String equs = "2*3-4="; // �Է� ���� ����
      String[] equsVar; // split ��ȯ �迭
      char oper[]; // �����ȣ ���� �迭
      char operVar[];
      int operCnt = 0; // ����Ƚ������
      int cnt = 0; // *,/ ����Ƚ������
      int result = 0; // �����
      int[] num; // ���� ���� ����迭
      int[] numVar; //
      int x = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.print("���� : ");
      equs = input.nextLine(); // ���ڿ� ���� �Է�
      equs = equs.replace(" ",""); // ���� ����
      equs = equs.replace("=", ""); // = �����

      for (int i = 0; i < equs.length(); i++) { // ���� Ƚ�� ī��Ʈ
         if (equs.charAt(i) == '+' || equs.charAt(i) == '-')
            operCnt++;
         if (equs.charAt(i) == '*' || equs.charAt(i) == '/') {
            cnt++;
            operCnt++;
         }
      }

      oper = new char[operCnt]; // �����ȣ����迭 �ʱ�ȭ
      operVar = new char[operCnt - cnt];
      
      for (int i = 0, j = 0; i < equs.length(); i++) // �����ȣ ����
         if (equs.charAt(i) == '+' || equs.charAt(i) == '-' || equs.charAt(i) == '*' || equs.charAt(i) == '/')
            oper[j++] = equs.charAt(i);

      equs = equs.replace("+", ":"); // |
      equs = equs.replace("-", ":"); // |
      equs = equs.replace("*", ":"); // |==> ������ ���� ���ڿ��� �迭�� ����
      equs = equs.replace("/", ":"); // |
      equsVar = equs.split(":"); 	 // |

      num = new int[equsVar.length]; // ���� ���� ����迭 �ʱ�ȭ
      numVar = new int[equsVar.length - cnt]; // ���� ���� ����迭 �ʱ�ȭ

      for (int i = 0; i < equsVar.length; i++)
         num[i] = Integer.parseInt(equsVar[i]); // int Ÿ������ ��ȯ�� �迭�� ����

      for (int i = 0; i < oper.length - x; i++) { // ����

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
      for (int i = 0; i < operVar.length; i++) { // ����
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