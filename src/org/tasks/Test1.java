package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.pojos.Address;
import org.pojos.Contact;
import org.pojos.Group;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		/*BufferedReader br = new BufferedReader(new FileReader("D://tasksdata//ContactData.txt"));
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
		System.out.println(hm);*/

		/*HashMap<String, Group> gm = new HashMap<String, Group>();
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
		System.out.println(gm.get("focus").getLi().size());*/
	/*	Scanner in = new Scanner(System.in);
		System.out.println("Enter the name and phone number to update:");
		String s=in.nextLine();
		String phno=in.nextLine();
		
		List<Contact> lc2=new ArrayList<Contact>();
		HashMap<String, List<Contact>> hm=GetContactData.getContactData();
		boolean b=false;
		for(String phn:hm.keySet())
		{
			for(Contact contact:hm.get(phn))
			{
				Contact c = contact;
				Address a=contact.getAddress();
				List<String> lc=contact.getGroupNames();
				if(contact.getName().equals(s)&&contact.getPhno().equals(phno))
				{
					b=true;
					System.out.print("Enter choice to updated:\n1.Name\n2.Email-Id\n3.Profession");
					System.out.println("\n4.City\n5.State\n6.Pin Code\n7.Phone Created Date\n8.Group Names");
					Scanner in1 = new Scanner(System.in);
					String st=new String();
					int ch =in.nextInt();
					switch(ch)
					{
						case 1:
								System.out.println("Enter the name to be updated..");
								st=in1.nextLine();
								c.setName(st);
								break;
						case 2:
								System.out.println("Enter the email id to be updated..");
								st=in1.nextLine();
								c.setEmailid(st);
								break;
						case 3:
								System.out.println("Enter the profession to be updated..");
								st=in1.nextLine();
								c.setProfession(st);
								break;
						case 4:
								System.out.println("Enter the city name to be updated..");
								st=in1.nextLine();
								a.setCity(st);
								c.setAddress(a);
								break;
						case 5:
								System.out.println("Enter the state to be updated..");
								st=in1.nextLine();
								a.setState(st);
								c.setAddress(a);
								break;
						case 6:
								System.out.println("Enter the pin to be updated..");
								st=in1.nextLine();
								a.setPin(st);
								c.setAddress(a);
								break;
						case 7:
								System.out.println("Enter the Contact created Date to be updated..");
								st=in1.nextLine();
								c.setCreatedDate(st);
								break;
						case 8:
								System.out.println("Enter the Group name to be updated..");
								st=in1.nextLine();
								lc.add(st);
								c.setGroupNames(lc);
								break;
						default:
								System.out.println("Invalid option entered...");
					}
					lc2.add(c);
				}
			}
		}
		if(!b)
			System.out.println("The entered data is wrong..");
		for(Contact contact:lc2)
		{
			System.out.println(contact.getName()+" "+contact.getEmailid()+" "+contact.getPhno());
		}
		*/
		/*for(String phno:hm.keySet())
		{
			for(Contact contact:hm.get(phno))
			{
				if(contact.getName().equals(s)||contact.getEmailid().equals(s))
					System.out.print(contact.getName()+" "+phno+",");
			}
		}
		System.out.println();
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
		System.out.println(hm1);
		for(String phno:hm1.keySet())
		{
			for(Contact contact:hm1.get(phno))
			{
				if(contact.getName().equals(s)||contact.getEmailid().equals(s))
					System.out.print(contact.getName()+" "+phno+",");
			}
		}*/
		
		/*HashMap<String, List<Contact>> hm =GetContactData.getContactData();
		for(String phno:hm.keySet())
		{
			if(phno.startsWith("9985"))
				System.out.println(phno);
		}*/
	}

}
