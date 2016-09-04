package ravi.tasks;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int val=n,sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		if(val%sum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not Harshad Number");
	}

}
