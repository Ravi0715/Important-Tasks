package ravi.tasks;

import java.util.Scanner;

public class PrimePalindromeIntegers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start range:");
		int m=in.nextInt();
		System.out.println("Enter end range:");
		int n=in.nextInt();
		if(m<3000&&n<3000)
		{
			System.out.println("The Prime Palindrome integers are:");
			for(int i=m;i<n;i++)
			{
				int flag=0;
				int temp=i;
				for(int j=2;j<i;j++)
					if(i%j==0)
						flag=1;
				if(flag==0)
				{
					StringBuffer sb = new StringBuffer();
					while(temp!=0)
					{
						sb.append(temp%10);
						temp/=10;
					}
					//System.out.println(sb);
					if(i==Integer.parseInt(sb.toString()))
					{
						System.out.println(i);
					}
				}
			}
		}
		else
		{
			System.out.println("Out of Range.....!!!!");
		}

	}

}
