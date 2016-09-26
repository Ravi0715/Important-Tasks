package org.pojos;

import java.util.List;

public class Group {

	String groupName;
	List<Contact> li;
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Contact> getLi() {
		return li;
	}
	public void setLi(List<Contact> li) {
		this.li = li;
	}
	
	
}
