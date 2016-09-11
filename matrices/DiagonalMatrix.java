package practice.matrices;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=in.nextInt();
		System.out.println("Enter elements of matrix:");
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter row "+(i+1)+" :");
			for(int j=0;j<n;j++)
			{
				//System.out.print("Enter a["+i+"]["+j+"] = ");
				a[i][j]=in.nextInt();
			}
		}
		int count=0,diagnoalZeroCount=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i!=j&&a[i][j]!=0)
				{
					count++;
					break;
				}
				if(i==j&&a[i][j]==0)
				{
					diagnoalZeroCount++;
				}
			}
		}
		if(count==0&&diagnoalZeroCount<n)
			System.out.println("Diagonal Matrix.......");
		else
			System.out.println("Not Diagonal Matrix.......");

	}

}
