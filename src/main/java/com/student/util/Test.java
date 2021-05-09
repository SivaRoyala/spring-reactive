package com.student.util;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3,4,5,6};
		
		int[] tempArray = new int[array.length];
		
		System.arraycopy(array ,0 ,tempArray ,0 ,array.length);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("#############");
		
		for(int i=0; i < array.length; i++) {
			System.out.println("index i "+i);
			int temp=0;
			System.out.println("Temp value before "+temp);
			for(int j=0; j < array.length; j++) {
				if(i != j) {
					System.out.println("index j "+j);
					temp = temp+tempArray[j];
					System.out.println("Temp value "+temp);
				}
			}
			//System.out.println("Temp value after "+temp);
			array[i] = temp;
		}
		
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
