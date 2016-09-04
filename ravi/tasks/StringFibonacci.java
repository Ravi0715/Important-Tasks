package ravi.tasks;

import java.util.Scanner;

public class StringFibonacci {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value:");
		int n=in.nextInt();
		String s1="a",s2="b",s3;
		System.out.print(s1+","+s2+",");
		for(int i=2;i<n;i++)
		{
			s3=s2.concat(s1);
			s1=s2;
			s2=s3;
			System.out.print(s3+",");
		}
	}

}
