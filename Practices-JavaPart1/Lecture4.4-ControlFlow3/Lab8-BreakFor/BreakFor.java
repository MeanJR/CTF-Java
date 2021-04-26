package com.ctf.BreakFor;

public class BreakFor {

	public static void main(String[] args) {
		
		//a
		int count = 20;
		for(count = 0; count < 20; count++) {
			
			if(count == 11) {
				
				System.out.println(count);
				break;
			}
			
			System.out.println(count);
		}

	}

}
