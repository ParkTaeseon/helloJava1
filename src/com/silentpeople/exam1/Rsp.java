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
			System.out.print("가위, 바위, 보를 선택해주세요 (exit : 종료) :  ");
			players = input.next();
			if (players.equals("exit")){
				cnt --;
				break;
			}

			if (players.equals("가위") || players.equals("바위") || players.equals("보")) {
				cValue = (int) (Math.random() * 3) + 1;
				System.out.println("------------------"+cnt+"round-------------------");
				System.out.print("You : " + players + "\t");
				switch (cValue) {
				case 1:
					System.out.println("Computer : 가위");
					break;
				case 2:
					System.out.println("Computer : 바위");
					break;
				case 3:
					System.out.println("Computer : 보");
					break;
				}
				switch (players) {
				case "가위":
					if (cValue == 1)
						drawCnt = draw(drawCnt);
					if (cValue == 2)
						loseCnt = lose(loseCnt);
					if (cValue == 3)
						winCnt = win(winCnt);
					break;
				case "바위":
					if (cValue == 1)
						winCnt = win(winCnt);
					if (cValue == 2)
						drawCnt = draw(drawCnt);
					if (cValue == 3)
						loseCnt = lose(loseCnt);
					break;
				case "보":
					if (cValue == 1)
						loseCnt = lose(loseCnt);
					if (cValue == 2)
						winCnt = win(winCnt);
					if (cValue == 3)
						drawCnt = draw(drawCnt);
					break;
				}
			} else {
				System.out.println("값을 잘못입력했습니다. 다시 입력해주세요!");
				continue;
			}
			System.out.println();
			cnt++;
		}
		winPct  = (int)(winCnt  / cnt * 100);
		drawPct = (int)(drawCnt / cnt * 100);
		losePct = (int)(loseCnt / cnt * 100);
		
		System.out.println("-------------------------------------------------------\n게임 결과 \n총 " + cnt + "round");
		System.out.println("\t경기수\t비율");
		System.out.println("승 :\t" + (int)winCnt  + "\t" + winPct + "%" );
		System.out.println("무 :\t" + (int)drawCnt + "\t" + drawPct + "%" );
		System.out.println("패 :\t" + (int)loseCnt + "\t" + losePct + "%" );
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
