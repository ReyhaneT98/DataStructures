import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;

public class Fibonacci {
	
	public static long fibonacci(long number){
		
		if((number==0)||(number==1))
			return number;
		else
			return fibonacci(number-1)+fibonacci(number-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		System.out.printf("please enter number:");
			
			int n = input.nextInt();
			
			System.out.printf("\n");
			
			for( long counter=0;counter<=n;counter++)
		
			System.out.printf("Fibonacci of %d is : %d\n",counter,fibonacci(counter));
	}
}


