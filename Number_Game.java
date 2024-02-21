package com.Task1;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers series from start to end..?");
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		Random rd = new Random();
		int num = rd.nextInt(100);
		System.out.println(num);
		
	}
}
