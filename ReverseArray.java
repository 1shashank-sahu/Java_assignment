package com.training.basic;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
		for(int i=arr.length-1;i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	
}
