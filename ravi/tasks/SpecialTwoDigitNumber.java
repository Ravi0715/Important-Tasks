package ravi.tasks;

import java.util.Scanner;

public class SpecialTwoDigitNumber {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the special two digit number");
		int val=in.nextInt();
		int t=val;
		int c=(int)Math.log10(val)+1;
		if(c==2)
		{
			int a[] =new int[c];
			int p=0;
			while(val!=0)
			{
				a[p++]=val%10;
				val/=10;
			}
			int sum=a[0],product=a[0];
			for(int i=1;i<a.length;i++)
			{
				sum+=a[i];
				product*=a[i];
			}
			if((sum+product)==t)
				System.out.println("Special-two digit number");
			else
				System.out.println("Not a special-two digit number");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
