package practice;
import java.util.Scanner;
public class ReversePrint {
	public static void main(String[] args) {
		System.out.println("Please enter a number to reverse it:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int i=0;
		int rev=0;
		// The following while loop is to calculate the number of digits in the given
		// number.
		while(b!=0){
			b=b/10;
			i++;
		}
		--i; // If the number of digits is 3, then 10^2 must be multiplied to the 
		// highest number
	   while(i>=0){
			rev+=(a%10)*(Math.pow(10,i));
			--i;
			a=a/10;
		}
		System.out.println("the reverse of the given number is:"+rev);
	
        sc.close();
	}

}
