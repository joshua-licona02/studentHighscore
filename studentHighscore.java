package csi.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: Find the highest score
 */

public class studentHighscore {

	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		
		int highScore = 0; 			
		String highScoreName = "";

	
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		
		System.out.println("Enter each student’s name and score");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Student: " + (i + 1) +
				"\n   Name: ");
			String name = input.next();
			System.out.println(	"Score: ");
			int score = input.nextInt();

		
			if (score > highScore)
			{
				highScore = score;
				highScoreName = name;
			}

		}
		System.out.println("Student with the highest score: " + highScoreName);
	}
}
