package com.horizon.lab_1.utils;

import java.beans.JavaBean;

@JavaBean
public class Math {

	private int operand1;
	private int operand2;

	public Math() {}

	public void setOperand1(int operand1) { this.operand1 = operand1; }
	public void setOperand2(int operand2) { this.operand2 = operand2; }

	public int add() { return operand1 + operand2; }
	public int subtract() { return operand1 - operand2; }
	public int multiply() { return operand1 * operand2; }
	public int divide() { return operand1 / operand2; }
}
