package practice.matrices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReArrangingMatrix {

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
		
		System.out.println("Original");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=0&&i!=n-1)
				{
					if(j!=0&&j!=n-1)
					{
						//System.out.print("  ");
						li.add(a[i][j]);
					}
				}
			}
		}
		//System.out.println(li);
		Collections.sort(li);
		int p=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i!=0&&i!=n-1)
				{
					if(j!=0&&j!=n-1)
					{
						//System.out.print("  ");
						a[i][j]=li.get(p++);
					}
				}
			}
		}
		System.out.println("Re Arranged..");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		int sum=0;
		System.out.println("Diagnoal Pattern:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]+" ");
					sum+=a[i][j];
				}
				else if(i+j==n-1)
				{
					System.out.print(a[i][j]+" ");
					sum+=a[i][j];
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		System.out.println("Sum:"+sum);
	}

}
