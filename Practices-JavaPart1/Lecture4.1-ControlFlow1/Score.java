package com.ctf.Score;

public class Score {

	public static void main(String[] args) {

		int score = 50;

		boolean isHandsome = false;

		if (isHandsome == true) {

			System.out.println("Good");
			
		} else {

			if (score >= 80) {
				
				System.out.println("Good");

			} else if (score >= 50 && score < 80) {
				
				System.out.println("normal");
				
			} else if (score < 50) {
				
				System.out.println("fall");
			}
		}

	}

}
