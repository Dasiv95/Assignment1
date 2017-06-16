package practice;

import java.util.Scanner;

public class MinFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
        System.out.println("Please enter the four numbers to find out the minimumm of them : ");
        for(int i=0; i<4 ; i++){
            a[i]=sc.nextInt();
            if(i<3){
            	System.out.println("Please Enter the next number");
            }
        }
        int min= a[0];
        
        for(int i=0;i<4;i++){
        	for(int j=i+1;j<4;j++){
        		if(min>a[j]){
        			min = a[j];
        		}
        	}
        }
        System.out.println("The minimum of the given four numbers is :" + min);
        sc.close();

	}

}
