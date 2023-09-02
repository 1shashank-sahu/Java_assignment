package com.training.basic;


public class Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,3,4,12,13,14,11,6,7,14,9};
		int min=arr[0];
		for(int i =0 ; i<arr.length;i++) {
			if(min>arr[i])min =arr[i];
		}
		System.out.println(min);
		}

}
