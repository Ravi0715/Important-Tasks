package practice.matrices;

import java.util.Scanner;

public class PrintBorderElements {

	public static int isPrime(int n)
	{
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0){
				flag++;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the m:");
		int m=in.nextInt();
		System.out.println("Enter the n:");
		int n=in.nextInt();
		int flag=isPrime(m);
		int flag1=isPrime(n);
		if(flag==0&&flag1==0)
		{
			System.out.println("Enter elements of matrix:");
			int a[][] = new int[m][n];
			for(int i=0;i<m;i++)
			{
				//System.out.println("Enter row "+(i+1)+" :");
				for(int j=0;j<n;j++)
				{
					//System.out.print("Enter a["+i+"]["+j+"] = ");
					a[i][j]=in.nextInt();
				}
			}
			System.out.println("Printing Border....");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==0||i==m-1)
					{
						System.out.print(a[i][j]+" ");
					}
					else
					{
						if(j==0||j==n-1)
						{
							System.out.print(a[i][j]+" ");
						}
						else
						{
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Can't Possible.....");
		}
	}

}
