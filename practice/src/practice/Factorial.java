package practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Please input a number to calculate it's factorial : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int prod = 1;
		for(int i=1;i<=a;i++)
			prod*=i;
		System.out.println("The factorial of the given number is : " + prod);
		sc.close();
	}

}
