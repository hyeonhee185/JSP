package com.java.main;

import com.java.module.CalModule;

public class Calculator {
	
	private CalModule sum;// = new Summation();
	private CalModule minus;// = new Minus();
	private CalModule multi;// = new Multiplex();
	private CalModule divide;// = new Divide();
	
	
	
	public void setSum(CalModule sum) {
		this.sum = sum;
	}

	public void setMinus(CalModule minus) {
		this.minus = minus;
	}

	public void setMulti(CalModule multi) {
		this.multi = multi;
	}

	public void setDivide(CalModule divide) {
		this.divide = divide;
	}

	public int sum(int a, int b) { // Service
		int result = 0;
		
		try {
			result =  sum.execute(a, b); // DAO
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int minus(int a, int b) {
		int result = 0;
		
		try {
			result =  minus.execute(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int multi(int a, int b) {
		int result = 0;
		
		try {
			result =  multi.execute(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int divide(int a, int b) {
		int result = 0;
		
		try {
			result =  divide.execute(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
