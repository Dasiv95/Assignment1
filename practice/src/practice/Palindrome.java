package practice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		/*
		 * A given number is palindrome if the reverse of that number is same as 
		 * this number.
		 */
		System.out.println("Please input a number to check if it is palindrome or not : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a, c=a;
		int rev = 0,i=0;
		while(b!=0){
			++i;
			b=b/10;
		}
		--i;
		while(i>=0){
			rev+=(c%10)*Math.pow(10,i);
			--i;
			c = c/10;
		}
		if(rev==a)
			System.out.println("This number is a palindrome number");
		else
			System.out.println("The given number is not a palindrome");
        sc.close();
	}

}
