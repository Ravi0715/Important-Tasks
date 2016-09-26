package org.tasks;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.pojos.Contact;

public class Task10 {

	public static void main(String[] args) throws IOException {
		
		HashMap<String, List<Contact>> hm =GetContactData.getContactData();
		for(String phno:hm.keySet())
		{
			if(phno.startsWith("9985"))
				System.out.println(phno);
		}

	}

}
