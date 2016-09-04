package ravi.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class HighestCommonFactor {

	public static HashMap<Integer, List<Integer>> returnFactors(int a[])
	{
		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
		for(int i=0;i<a.length;i++)
		{
			List<Integer> li = new ArrayList<Integer>();
			for(int j=1;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
					li.add(j);
			}
			//li.add(a[i]);
			hm.put(a[i], li);
		}
		return hm;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[] = new int[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the number "+(i+1)+":");
			a[i]=in.nextInt();
		}
		HashMap<Integer, List<Integer>> hm =HighestCommonFactor.returnFactors(a);
		List<Integer> li=hm.get(a[0]);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int x:li)
		{
			int count=0;
			for(List<Integer> al:hm.values())
			{
				if(al.contains(x))
					count++;
					
			}
			if(count==hm.size()&&x!=1)
				ts.add(x);
		}
		if(ts.isEmpty())
			System.out.println("No Common Factors..");
		else
			System.out.println("Highest Common Factor:"+ts.last());
	}
}
