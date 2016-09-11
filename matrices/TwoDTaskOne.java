package practice.matrices;

import java.util.Scanner;

public class TwoDTaskOne {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=in.nextInt();
		char a[][] = new char[n][n];
		if(n>10)
		{
			System.out.println("Out of range.....");
			System.exit(0);
		}
		System.out.println("Enter 1st character:");
		char ch = in.next().charAt(0);
		System.out.println("Enter 2nd character:");
		char ch1 = in.next().charAt(0);
		System.out.println("Enter 3rd character:");
		char ch2=in.next().charAt(0);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1)
				{
					if(j!=0&&j!=n-1)
						System.out.print(ch+" ");
					else
						System.out.print(ch2+" ");
				}
				else
				{
					if(j==0||j==n-1)
						System.out.print(ch1+" ");
					else
						System.out.print(ch2+" ");
				}
			}
			System.out.println();
		}

	}

}
