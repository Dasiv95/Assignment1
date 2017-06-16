package practice;

public class OddNumbers {
	
	public static void main(String[] args) {
		System.out.println("The following are the odd numbers from 1 to 100");
		for(int i=1;i<=100;i++){
			if(i%2==0){
				continue;
			}
			else
				System.out.println( "This is the #"+(i/2)+" prime number : "+i );
		}

	}

}
