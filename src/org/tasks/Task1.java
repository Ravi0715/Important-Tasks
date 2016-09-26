package org.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.pojos.Contact;

public class Task1 {

	public static List<String> getPhoneNumbersByName(String s) throws IOException
	{
		List<String> phnoList=new ArrayList<String>();
		HashMap<String, List<Contact>> hm=GetContactData.getContactData();
		for(String phno:hm.keySet())
		{
			for(Contact contact:hm.get(phno))
			{
				if(contact.getName().equals(s))
					phnoList.add(phno);
			}
		}
		return phnoList;
	}
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name to find:");
		String s=in.nextLine();
		List<String> phnoList = Task1.getPhoneNumbersByName(s);
		System.out.println(phnoList);
	}

}
