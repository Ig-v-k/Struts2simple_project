package com.struts2.beans;

import java.util.ArrayList;

import com.struts2.interfaces.UserRoleExtendingMethods;

public class Users implements UserRoleExtendingMethods<ArrayList<String>>{
	private String username;
	private String password;
	private String userRole;
	private ArrayList<String> list = new ArrayList<String>();
	
	public Users() {
		this.username = "";
		this.password = "";
		this.userRole = "";
	}
	
	public Users(final String username, final String password, final String userRole) {
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}

	@Override
	public void rename(ArrayList<String> list) {
		int i = 0;
		for(String a : list) {
			this.username = list.get(i);
			i++;
		}
	}
	
	@Override
	public ArrayList<String> getAll() {
		if(username.length() == 0 && password.length() == 0 && userRole.length() == 0)
			new Exception().getMessage();
		
		this.list.add(username);
		this.list.add(password);
		this.list.add(userRole);
		
		return list;
	}
}
