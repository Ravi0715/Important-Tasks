package ravi.tasks;

import java.util.Scanner;

public class HappyNumber {

	public static boolean isHappyNumber(int n)
	{
		int x=n;
		if(x==1)
			return true;
		else
		{
			int sum=0;
			while(x!=0)
			{
				sum+=(int)Math.pow(x%10, 2);
				System.out.println(sum);
				x/=10;
			}
			isHappyNumber(sum);
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int n=in.nextInt();
		boolean b =isHappyNumber(n);
		if(b)
			System.out.println("Happy");
		else
			System.out.println("Not  ");

	}

}
