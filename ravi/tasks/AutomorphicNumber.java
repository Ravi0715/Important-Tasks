package ravi.tasks;

import java.util.Scanner;

public class AutomorphicNumber {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		int temp=n;
		int a[] = new int[(int)Math.log10(n)+1];
		int p=0;
		while(temp!=0)
		{
			a[p++]=temp%10;
			temp/=10;
		}
		int square=n*n;
		int count=0,flag=0;
		while(square!=0)
		{
			if(count<=1)
			{
				if((square%10)==a[0]||(square%10)==a[1])
				{
					flag++;
				}
				count++;
			}
			square/=10;
		}
		if(flag==2)
			System.out.println(n+" is Automorphic Number");
		else
			System.out.println(n+" is not Automorphic Number");
		
	}

}
