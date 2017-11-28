package term3_7;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;
import java.util.Arrays;

public class List {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter the number of incoming numbers : ");
		int a = input.nextInt();

		int arr[] = new int[a];
		
		for(int i=0;i<a;i++){
			
			System.out.print("\nplease enter input No."+(i+1)+":" );
			int number = input.nextInt();
			
			 arr[i] = number ;
		}
		
		Arrays.sort(arr);
		
		System.out.print("\nEnter a number to search this list : ");
		int n = input.nextInt();
		
		if(LinearSearch(arr,n)!=-1)
		System.out.print("\nThere is "+LinearSearch(arr,n)+" in the list");
		else
			System.err.print("\nNot found");
	}
 
public static int LinearSearch(int[] A ,int item){
		int j =0;
		while(j<A.length && A[j]<item)
			j++;
			if(A[j]==item)
				return item;
			else
		return -1;
	
		}
}
