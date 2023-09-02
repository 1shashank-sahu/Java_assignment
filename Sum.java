package com.training.basic;

public class Sum {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,12,13,14,11,6,7,14,9}; 
		int sum =0 ;
		int avg =0;
		
		for(int i=1 ; i<arr.length ; i++)
		{
			sum +=arr[i];
			
			}
		avg = sum/arr.length;
		System.out.println("sum ="+sum);
		System.out.println("avg ="+avg);
		
	}

}
