package ravi.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int pro1=n*1;
		int pro2=n*2;
		int pro3=n*3;
		StringBuffer sb = new StringBuffer();
		int count=0;
		sb.append(pro1+""+pro2+""+pro3);
		List<Character> li = new ArrayList<Character>();
		for(char i='0';i<='9';i++)
		{
			for(int j=0;j<sb.toString().length();j++)
			{
				if(i==sb.charAt(j)&&(!(li.contains(i))))
				{
					count++;
					li.add(i);
				}
			}
		}
		//System.out.println(li);
		/*for(int i=0;i<=9;i++)
		{
			int val=Integer.parseInt(sb.toString());
			while(val!=0)
			{
				if(i==val%10)
					count++;
				val/=10;
			}
		}*/
		if(count==9||count==10)
			System.out.println("Fascinating Number....");
		else
			System.out.println("Not Fascinating Number....");

	}

}
