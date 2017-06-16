package practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		/*
		 * A number N is an armstrong number of order 'n' if
		 *  abcd... = a^n + b^n + c^n + d^n + ... = N
		 */
		System.out.println("Please input a number to check if it is an armstrong number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=0, sum=0;
		int b = a;
		int c = a;
		// The following while loop is to calculate the number of digits in the given
		//number
		while(b>0){
			++i;
			b=b/10;
		}
		// The following while loop is to calculate the sum of powers of individual digits
		// to the number of digits
		while(c>0){
			sum+=Math.pow((c%10),i);
			c = c/10;
			
		}
		if(sum==a)
			System.out.println("This is an armstrong number of order : "+i);
		else
			System.out.println("This is not an armstrong number");  
		sc.close();

	}

}
