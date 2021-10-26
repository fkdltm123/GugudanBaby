package edu.play;

public class Calculation {

	public void gugudan1() {
		
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				System.out.println(i * j);
			}
			
		}
		
	}//void
	
	
	
	
	public void verticalGugu() {
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 2; j <= 9; j++) {
				
				System.out.print(i * j);
				
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}


	public void numberArr() {
		int numArr[] = {1,2,3,4,5};
		int result = 0; 
		
		System.out.print(numArr.toString() + "->");
		for(int i = 0; i < numArr.length; i++) {
			result += numArr[i];
			System.out.print(result);
		}
	}
	
}
