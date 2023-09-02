package com.training.basic;

public class Greater {

	public static void main(String[] args) {
       int arr[] = {22,33,44,55,6};
       int max =0;
       for (int i = 0;i<arr.length;i++) {
    	   if(max<arr[i])max = arr[i];
       }
       System.out.println(max);
	}

}
