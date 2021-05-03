package com.ctf.Array;

public class DimensionArray {

	public static void main(String[] args) {
		
		int[][] numbers = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9}, {0} };
		
		printArray(numbers);
		
		
	}
	
	public static void printArray(int[][] arrays) {
		
		int sum = 0;
		
		for(int row = 0; row < arrays.length; row++) {
			
			for(int index = 0; index < arrays[row].length; index++ ) {
				
				System.out.print(arrays[row][index] + " ");
						
			}
			System.out.println();
			
			sum += arrays[row][arrays[row].length-1];

		}
		
		System.out.println(sum);
	
		
	}

}
;