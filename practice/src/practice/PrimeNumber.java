package practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Please enter the number to be checked:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a/2;
		for(int i=2;i<=b;i++){
			if(a%i==0){
				System.out.println("The given number is not a prime number");
				break;
			}
		if(i==b){
			System.out.println("The given number is a prime number");
		}
			
		}
		sc.close();
	}
		

	}