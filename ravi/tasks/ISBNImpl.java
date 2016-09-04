package ravi.tasks;

import java.util.Scanner;

public class ISBNImpl {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ISBN Number");
		String val=in.next();
		int j=val.length();
		int sum=0;
		if(j==10)
		{
			for(int i=0;i<val.length();i++)
			{
				char ch =val.charAt(i);
				if(ch=='X'&&i==val.length()-1)
				{
					sum+=(j*10);
					j--;
					
				}
				if(Character.isDigit(ch))
				{
					sum+=(j*(Integer.parseInt(Character.toString(ch))));
					j--;
				}
			}
			//System.out.println(sum);
			if(sum%11==0)
				System.out.println("Valid ISBN Number");
			else
				System.out.println("Invalid ISBN Number");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
