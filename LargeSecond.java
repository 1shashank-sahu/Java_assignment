package com.training.basic;

public class LargeSecond {
	
	public static void main(String[] args) {
		int num[] = { 1,2,3,4,12,13,19,11,6,7,14,9}; 
		int high1 = Integer.MIN_VALUE;
	    int high2 = Integer.MIN_VALUE;
	    for (int i =0 ; i<num.length;i++) {
	      if (num[i] > high1) {
	        high2 = high1;
	        high1 = num[i];
	      } else if (num[i] > high2) {
	        high2 = num[i];
	      }
	    }
		System.out.println(high2);
		
	}
}
