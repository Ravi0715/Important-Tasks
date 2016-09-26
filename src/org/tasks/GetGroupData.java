package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.pojos.Contact;
import org.pojos.Group;

public class GetGroupData {

	public static HashMap<String, Group> getGroupData() throws IOException
	{
		HashMap<String, Group> gm = new HashMap<String, Group>();
		HashMap<String, List<Contact>> hm=GetContactData.getContactData();
		BufferedReader br = new BufferedReader(new FileReader("D://tasksdata//GroupData.txt"));
		String line;
		while((line=br.readLine())!=null)
		{
			String arr[]=line.split(",");
			Group group = new Group();
			group.setGroupName(arr[0]);
			List<Contact> li = new ArrayList<Contact>();
			for(String phno:hm.keySet())
			{
				List<Contact> lc=hm.get(phno);
				for(Contact contact:lc)
				{
					if(contact.getGroupNames().contains(group.getGroupName()))
						li.add(contact);
				}
			}
			group.setLi(li);
			gm.put(group.getGroupName(), group);
		}
		return gm;
	}
}
