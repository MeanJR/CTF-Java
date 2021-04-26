package com.ctf.WhileLoop;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		int sumMod12 = 0;
		while(i <= 10) {
			
		//1
			System.out.println(i);
			sum += i;
			i++;
					
		}
		 //2
		System.out.println("The summary is "+sum);
		
		
		
		int j = 0;	
		while(j <= 100) {
			
			if(j%12 == 0) {
				
					sumMod12 += j;
					
			}
			j++;
			
		}		
		//3
		
		System.out.println("The summary of i devide 12 is "+sumMod12);
		
		//4
		int[] numArray = { 1,2,3,4,5};
		
		for(int a : numArray){
			
			System.out.println("for each Array :"+ a);
		}
		

	}

}
