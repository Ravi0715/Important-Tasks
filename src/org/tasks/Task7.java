package org.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.pojos.Address;
import org.pojos.Contact;

public class Task7 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
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

	}

}
