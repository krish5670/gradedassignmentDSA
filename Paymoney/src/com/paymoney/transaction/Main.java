package com.paymoney.transaction;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the transaction size");
		int transactionArraysize=sc.nextInt();
		int[] transValue= new int[transactionArraysize];
		System.out.println("Enter the values");
		for(int i=0; i<transactionArraysize; i++) {
			transValue[i]=sc.nextInt();
		}
		System.out.println("Enter the total target to be met");
		int totalTargettoAchieve=sc.nextInt();
		arraySum tc=new arraySum();
		for(int i=0; i<totalTargettoAchieve;i++) {
		System.out.println("Enter the target value");
		int targetValue=sc.nextInt();
		tc.targetTransaction(transValue,targetValue);
		
		}
		sc.close();



	}

}
