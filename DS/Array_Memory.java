package term3_6;

import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;

public class Array_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		int a[]=new int [25];
		
	for(int i=0;i<25;i++){
		
		System.out.print("please enter input No."+(i+1)+":");
		int number_1 = input.nextInt();
		
	  a[i]=number_1;
	}
	
	System.out.print("Dear user, re-enter one of the input numbers to find the storage location : ");
	int number_2 = input.nextInt();
	
	for (int i=0;i<25;i++){
		if(a[i]==number_2){
			
			int loc =1000 + 4*(i); //if Base=1000
			System.out.println("The memory location " +number_2+ " is "+loc);
		}
	}
	
	}
}


