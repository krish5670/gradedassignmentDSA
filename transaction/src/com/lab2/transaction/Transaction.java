package com.lab2.transaction;
import java.util.Scanner;
class Transaction {

	public static void currencyCounter() throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Enter the no of denominations that you want to use");
			int denominations = sc.nextInt();
			int arr[]= new int[denominations];
			System.out.println("\n Enter the values of currency denominations");
			for (int i=0; i<denominations; i++)
				arr[i]=sc.nextInt();
			System.out.println(" \n Enter the amount you want to pay");
			int targetAmount = sc.nextInt();
			sc.close();
			if (targetAmount ==0) {
				
				System.out.println(" \n Entered amount is invalid");
			
			}else {
				int[] counter= new int[denominations];
				int[] notes = new int[arr.length];
				for (denominations=0; denominations<9; denominations++) {
					
					if (targetAmount>= counter[denominations]) {
						notes[denominations]=targetAmount /counter[denominations];
							targetAmount=targetAmount-notes[denominations]*counter[denominations];
						}
					};
					System.out.println("Order of Currency ->");
			        for (int i = 0; i < 9; i++) {
			            if (notes[i] != 0) {
			                System.out.println(counter[i] + " : "
			                    + notes[i]);
			            }
			        }
					
				}
			
			
		}
	public static void main(String[] argc) throws Exception {
		currencyCounter();
	}
}
		

		