package ravi.tasks;

import java.util.Scanner;

public class CompositeMagicIntegers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter start range:");
		int m=in.nextInt();
		System.out.println("Enter end range:");
		int n=in.nextInt();
		int count=0;
		if(m<n)
		{
			for(int i=m;i<=n;i++)
			{
				int flag=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						flag=1;
				}
				if(flag!=0)
				{
					int x=i;
					int sum=0;
					while(x!=0)
					{
						sum+=x%10;
						x/=10;
					}
					if(sum==10||sum==1)
					{
						System.out.println(i);
						count++;
					}
				}
			}
			System.out.println("Frequency:"+count);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
