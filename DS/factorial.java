import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;

public class factorial {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);
		System.out.printf("please enter number :");
		
		int num = input.nextInt();
		
		int result = fact(num);
	
		System.out.println("Factirai of the number is : " + result);
	}
		static int fact(int n){
			if (n<=1){
				return 1;
			}else{
				return n*fact(n-1);
			
		}
	}

}
