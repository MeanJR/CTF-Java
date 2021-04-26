package com.ctf.ContinueFor;

public class ContinueFor {

	public static void main(String[] args) {
		
		int count = 20;
		for(count = 0; count < 20; count++) {
						
			
			if(count == 11) {
				
				System.out.println(count);
				continue;
				
			}
			
			System.out.println(count);
			
		}

	}

}
