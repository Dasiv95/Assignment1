package practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Please input a number to check if it is perfect or not : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a/2,sum=0;
		for(int i=1; i<=b; i++){
			if(a%i==0){
				sum+=i;
			}
		}
		if(sum==a && a!=0)
			System.out.println("The given number is a perfect number");
		else
			System.out.println("The given number is not a perfect number");
		sc.close();

	}

}
