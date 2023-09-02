package com.training.basic;
import java.util.*;
import java.io.*;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
	    
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int temp = 0;
	            if (arr[j] < arr[i]) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        System.out.print(arr[i] + " ");
	    }
	}
	

}

