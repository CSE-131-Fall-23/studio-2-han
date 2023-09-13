package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter start amount:");
		int startAmount = in.nextInt();
		System.out.print("Enter chance of winning:");
		Double winChance = in.nextDouble();
		System.out.print("Enter win limit:");
		int winLimit = in.nextInt();
		System.out.print("Enter total simulations:");
		int totalSimulations = in.nextInt();
		
		for (int i=1;i<=totalSimulations;i++) {
			int amount = startAmount;
			int count = 0;
			System.out.print("Simulation "+i+": ");
			while (amount>0 && amount<winLimit) {
				int win = 0;
				if (Math.random()<winChance) {
					win = 1;
				}
				amount = amount+win*2-1;
				count += 1;
			}
			System.out.print(count);
			if (amount==0) {
				System.out.println(" Ruin");
			}else {
				System.out.println(" Success");
			}
		}
		double a = ((1-winChance)/winChance);
		if (winChance == 0.5 ) {
			System.out.print(1 - startAmount/winLimit);
		}else {
			System.out.print((Math.pow(a,startAmount)- Math.pow(a,winLimit))/(1-Math.pow(a,winLimit)));
			}
				
	}

}
