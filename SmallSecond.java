package com.training.basic;

public class SmallSecond {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,12,13,14,11,6,7,14,9}; 
		int mx1=Integer.MAX_VALUE , mx2=Integer.MAX_VALUE;
		
		for(int i=1 ; i<arr.length ; i++)
		{
			if(mx1>arr[i]) {mx1=arr[i];
			mx2=mx1;}
			if(mx2>arr[i]&&arr[i]>mx1)mx2=arr[i];
			
			}
		System.out.println(mx2);
		
	}

}
