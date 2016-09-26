package org.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.pojos.Contact;

public class Task6 {
	
	
	public static void main(String args[]) throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name:");
		String s=in.nextLine();
		HashMap<String, List<Contact>> hm=GetContactData.getContactData();
		HashMap<String, List<Contact>> hm1=new HashMap<String, List<Contact>>();
		for(String phno:hm.keySet())
		{
			for(Contact contact:hm.get(phno))
			{
				if(!(contact.getName().equals(s)||contact.getEmailid().equals(s)))
				{
					List<Contact> lc = new ArrayList<Contact>();
					if(hm1.containsKey(phno))
					{
						lc=hm1.get(phno);
						lc.add(contact);
						hm1.put(phno, lc);
					}
					else
					{
						lc.add(contact);
						hm1.put(phno, lc);
					}
				}
			}
		}
		//System.out.println(hm1);
		System.out.println("Successfully deleted........");
	}

}
