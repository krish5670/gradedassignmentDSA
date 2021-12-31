package com.paymoney.transaction;

public class arraySum {

	public void targetTransaction(int[] valueTransaction, int targetValue) {
		int transSize=valueTransaction.length;
		int calcValue=0;
		int iteratingCount=0;
		int count=0;
		while(targetValue>calcValue && iteratingCount<transSize) {
			calcValue=calcValue+valueTransaction[count];
			iteratingCount++;
			count++;
		}
		if (calcValue>=targetValue) {
			System.out.println("Target met after"+count+"transactions");
		}else {
			System.out.println("Target not met");
		}
	}

}
