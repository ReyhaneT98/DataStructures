import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.text.MessageFormat;

public class Hanoi {
	
	 public static void move(int n,int start,int end){
		 if(n==0){
			 return;
		 }
		 int intermediat = 6-start-end;
		 move(n-1,start,intermediat);
		 System.out.println("move"+n +"from"+start+"to"+end);
		 move(n-1,intermediat,end);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.printf("please enter number of disk :");
		
		int n = input.nextInt();
		
		move(n,1,3);
		 
	}

}
