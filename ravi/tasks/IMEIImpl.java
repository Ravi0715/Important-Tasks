package ravi.tasks;

import java.util.Scanner;

public class IMEIImpl {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the IMEI Number");
		String imeiNo=in.next();
		int sum=0;
		if(imeiNo.length()==15)
		{
			for(int i=0;i<imeiNo.length();i++)
			{
				char ch = imeiNo.charAt(i);
				if(i%2==0)
				{
					int val = Integer.parseInt(Character.toString(ch));
					sum+=val;
				}
				else
				{
					int val = Integer.parseInt(Character.toString(ch));
					Integer obj=val*2;
					String s=obj.toString();
					int j=0;
					while(s.length()>j)
					{
						sum+=Integer.parseInt(Character.toString(s.charAt(j)));
						j++;
					}
				}
			}
			System.out.println("Sum:"+sum);
			if(sum%10==0)
				System.out.println("Valid IMEI Number");
			else
				System.out.println("Invalid IMEI Number");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
