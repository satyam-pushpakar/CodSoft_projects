package com.Task;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mar, hindi, history, english, maths, sum = 0;
		int percentage;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter obtained marks out of 100 in every subjects");
		System.out.println("-------------------------------------------------");
		
		System.out.println("Enter marks of Marathi: ");
		mar = sc.nextInt();
		System.out.println("Enter marks of Hindi: ");
		hindi = sc.nextInt();
		System.out.println("Enter marks of History: ");
		history = sc.nextInt();
		System.out.println("Enter marks of English: ");
		english = sc.nextInt();
		System.out.println("Enter marks of Maths: ");
		maths = sc.nextInt();
		
		sum = mar + hindi + history + english + maths;
		percentage =(sum*100)/500;
		
		System.out.println("-------------------------------------------------");
		System.out.println("Marks obtained out of 500 is "+sum);
		System.out.println("Average Percentage: "+percentage+"%");
		
		if (percentage >= 95) 
		{
			System.out.println("O Grade.");
		} 
		else if (percentage >= 75 && percentage < 95) 
    	{
			System.out.println("A Grade.");
		}
		else if (percentage >=60 && percentage < 75) 
		{
			System.out.println("B Grade.");
		}
		else if (percentage >=45 && percentage < 60) 
		{
			System.out.println("C Grade.");
		}
		else if (percentage >= 35 && percentage < 45) 
		{
			System.out.println("D Grade.");
		} 
		else
		{
			System.out.println("Fail...! 😢");
		}
		System.out.println("-------------------------------------------------");
	}

}
