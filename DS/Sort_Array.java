package term3_9;

import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t,i,j,max_1;
        Scanner input = new Scanner(System.in);
		
		int A[][]=new int [10][15];
		
		int min =0 ;
		int max = 1000;
		
	for( i=0;i<10;i++){
		
		for( j=0;j<15;j++)
			
	  A[i][j]= min + (int)(Math.random()*(max-min+1));
	}
	
	//
	
	for( i=0;i<10;i++){
		for( j=0;j<15;j++){
			for(int f=0;f<10;f++){
				for(int k=0;k<15;k++){
				if(A[f][k]>A[i][j]){
					  max_1=A[i][j];
					A[i][j]=A[f][k];
					A[f][k]=max_1;
				}
				}
			}
		}
		
	}
	
	for(int f=0;f<10;f++){
		for(int k=0;k<10;k++){
			System.out.print(A[f][k]+"\t");
		}
		System.out.println("\n");
	}
	
	//**********************************************************
	
	System.out.println("\n");
	
	//**********************************************************
	
	
	//
	
	for(int satr=0;satr<10;satr++){
		
		for(int s=0;s<15;s++){
		 	
			int key=A[satr][s];
			
			for( t=s-1;t>=0;t--){
				
				if(A[satr][t]<key)
					A[satr][t+1]=A[satr][t];
				
				else
					break;
			}
			A[satr][t+1]=key;
		}
	}
	for( i=0;i<10;i++){
		for( j=0;j<15;j++){
			System.out.printf(A[i][j]+"\t");
		}
		System.out.printf("end\t");
	}
	
	}

}
