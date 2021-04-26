package com.ctf.Continue;

public class Continue {

	public static void main(String[] args) {
		
		int count = 10;
		for(int i = 1; i <= count; i++) {
			
			if( i == 2) {
				
				continue;
			}
			
			System.out.println(i);
			
		}

	}

}
