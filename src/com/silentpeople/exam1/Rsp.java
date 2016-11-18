package com.silentpeople.exam1;

import java.util.*;

public class Rsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String players;
		int cValue, winPct, drawPct, losePct;
		int cnt = 1;
		double winCnt = 0;
		double drawCnt = 0;
		double loseCnt = 0;
		int esc = 0;
		Scanner input = new Scanner(System.in);

		while (esc != 1) {
			System.out.print("����, ����, ���� �������ּ��� (exit : ����) :  ");
			players = input.next();
			if (players.equals("exit")){
				cnt --;
				break;
			}

			if (players.equals("����") || players.equals("����") || players.equals("��")) {
				cValue = (int) (Math.random() * 3) + 1;
				System.out.println("------------------"+cnt+"round-------------------");
				System.out.print("You : " + players + "\t");
				switch (cValue) {
				case 1:
					System.out.println("Computer : ����");
					break;
				case 2:
					System.out.println("Computer : ����");
					break;
				case 3:
					System.out.println("Computer : ��");
					break;
				}
				switch (players) {
				case "����":
					if (cValue == 1)
						drawCnt = draw(drawCnt);
					if (cValue == 2)
						loseCnt = lose(loseCnt);
					if (cValue == 3)
						winCnt = win(winCnt);
					break;
				case "����":
					if (cValue == 1)
						winCnt = win(winCnt);
					if (cValue == 2)
						drawCnt = draw(drawCnt);
					if (cValue == 3)
						loseCnt = lose(loseCnt);
					break;
				case "��":
					if (cValue == 1)
						loseCnt = lose(loseCnt);
					if (cValue == 2)
						winCnt = win(winCnt);
					if (cValue == 3)
						drawCnt = draw(drawCnt);
					break;
				}
			} else {
				System.out.println("���� �߸��Է��߽��ϴ�. �ٽ� �Է����ּ���!");
				continue;
			}
			System.out.println();
			cnt++;
		}
		winPct  = (int)(winCnt  / cnt * 100);
		drawPct = (int)(drawCnt / cnt * 100);
		losePct = (int)(loseCnt / cnt * 100);
		
		System.out.println("-------------------------------------------------------\n���� ��� \n�� " + cnt + "round");
		System.out.println("\t����\t����");
		System.out.println("�� :\t" + (int)winCnt  + "\t" + winPct + "%" );
		System.out.println("�� :\t" + (int)drawCnt + "\t" + drawPct + "%" );
		System.out.println("�� :\t" + (int)loseCnt + "\t" + losePct + "%" );
	}
	public static double draw(double drawCnt) {
		System.out.println("Draw!!!\n-------------------------------------------");
		drawCnt++;
		return drawCnt;
	}
	public static double win(double winCnt) {
		System.out.println("You win!!!\n-------------------------------------------");
		winCnt++;
		return winCnt;
	}
	public static double lose(double loseCnt) {
		System.out.println("You lose!!!\n-------------------------------------------");
		loseCnt++;
		return loseCnt;
	}
}
