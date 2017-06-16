package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Please enter number upto which fibonacci series has to be printed : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t1=0, t2=1, t3=0;
		System.out.print("Fibonacci series is :"+t1+ " "+t2);
		t3 = t1 + t2;
		while(t3<=a){
			System.out.print(" "+t3);
			t1 = t2;
			t2 = t3;
			t3 =t1+t2;
		}
        sc.close();
	}

}
