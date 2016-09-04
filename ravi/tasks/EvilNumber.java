package ravi.tasks;

import java.util.Scanner;

public class EvilNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		int count=0;
		String bs=new Integer(n).toBinaryString(n);
		for(int i=0;i<bs.length();i++)
		{
			if(bs.charAt(i)=='1')
				count++;
		}
		if(count%2==0)
			System.out.println("Evil Number...");
		else
			System.out.println("Not Evil Number...");
	}

}
