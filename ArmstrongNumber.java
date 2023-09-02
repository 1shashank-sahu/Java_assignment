package com.training.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 371, originalNum, rem, res = 0;

	        originalNum= num;

	        while (originalNum != 0)
	        {
	            rem = originalNum % 10;
	            res += Math.pow(rem, 3);
	            originalNum /= 10;
	        }

	        if(res == num)
	            System.out.println(num + " is an Armstrong number.");
	        else
	            System.out.println(num + " is not an Armstrong number.");

	}

}
