package term3_5;

import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
			int c =0;
			int min =0 ;
			int max = 50;
			int a[]=new int [200];
			
		for(int i=0;i<200;i++){
			
		  a[i]= min + (int)(Math.random()*(max-min+1));
		}
		
		System.out.print("please enter number : ");
		
		int number = input.nextInt();
		
		for (int i=0;i<200;i++){
			if(a[i]<number){
				c++;
			}
		}
		
		System.out.println("\nThe number of repetitions "+number+" is "+c);
	}
}

