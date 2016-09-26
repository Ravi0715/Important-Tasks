package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.pojos.Address;
import org.pojos.Contact;

public class GetContactData {
	
	public static HashMap<String, List<Contact>> getContactData() throws IOException
	{

		BufferedReader br = new BufferedReader(new FileReader("D://tasksdata//ContactData.txt"));
		String line;
		HashMap<String, List<Contact>> hm = new HashMap<String, List<Contact>>();
		while((line=br.readLine())!=null)
		{
			String arr[]=line.split(",");
			Contact contact = new Contact();
			contact.setName(arr[0]);contact.setPhno(arr[1]);
			contact.setEmailid(arr[2]);contact.setProfession(arr[3]);
			Address address = new Address();
			address.setCity(arr[4]);address.setState(arr[5]);address.setPin(arr[6]);
			contact.setAddress(address);
			contact.setCreatedDate(arr[7]);
			List<String> groupNames=new ArrayList<String>();
			for(int i=8;i<arr.length;i++)
				groupNames.add(arr[i]);
			contact.setGroupNames(groupNames);
			List<Contact> lc = new ArrayList<Contact>();
			if(hm.containsKey(contact.getPhno()))
			{
				lc=hm.get(contact.getPhno());
				lc.add(contact);
				hm.put(contact.getPhno(),lc);
			}
			else
			{
				lc.add(contact);
				hm.put(contact.getPhno(),lc);
			}
		}
		return hm;
	}

}
