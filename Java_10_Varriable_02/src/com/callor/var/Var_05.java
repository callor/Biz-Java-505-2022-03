package com.callor.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		int intSum = 0;
		
		intNum1 = 55;
		intNum2 = 77;
		intSum = intNum1 + intNum2;
		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intSum);
		
		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intSum);
		
		System.out.println(intNum1 
				+ " + " 
				+ intNum2 
				+ " = " 
				+ intSum);
		intNum1 = 101;
		intNum2 = 202;
		System.out.printf("%d + %d = %d\n",
					intNum1, intNum2, intSum);
		System.out.printf("%d x %d = %d\n",
				intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d - %d = %d\n",
				intNum1, intNum2, intNum1 - intNum2);
		System.out.printf("%d / %d = %d\n",
				intNum1, intNum2, intNum1 / intNum2);
		
	}

}
