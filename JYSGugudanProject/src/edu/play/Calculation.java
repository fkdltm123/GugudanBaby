package edu.play;

public class Calculation {
	public void Gugudan1(){
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i*j);
			}
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
