package ravi.tasks;

import java.util.Scanner;

public class FilePath {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the file path:");
		String filePath=in.nextLine();
		/*String arr[]=filePath.split("\\");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length-1;i++)
			sb.append(arr[i]+"\\");
		String details[]=arr[arr.length].split(".");
		System.out.println("Path:"+sb.toString());
		System.out.println("File Name:"+details[0]);
		System.out.println("Extension:"+details[1]);*/
		int max=0;String fileName = null,extension = null;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<filePath.length();i++)
		{
			char ch =filePath.charAt(i);
			if(ch=='\\')
			{
				sb.append('\\');
				max=i;
			}
			else if(ch=='.')
			{
				fileName=filePath.substring(max+1, i);
				extension=filePath.substring(i+1, filePath.length());
			}
			else
			{
				sb.append(ch);
			}
		}
		String ss=sb.toString().substring(0, max);
		System.out.println("Path:"+ss);
		System.out.println("File Name:"+fileName);
		System.out.println("Extension:"+extension);
	}

}
