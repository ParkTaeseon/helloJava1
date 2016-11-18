package com.silentpeople.exam1;

public class ForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5 ; i++){
			for(int j = 0 ; j < i ; j++)
				System.out.print(" ");
			for(int j = 0 ; j < 9 - 2 * i ; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 4 ; i > 0 ; i--){
			for(int j = 0 ; j < i-1 ; j++)
				System.out.print(" ");
			for(int j = 0 ; j < 11 - 2 * i ; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
