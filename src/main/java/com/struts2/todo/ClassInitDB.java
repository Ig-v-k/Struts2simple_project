package com.struts2.todo;

import com.struts2.DB.UsersDB;

public final class ClassInitDB {
	private static UsersDB repository;
	
	static {
		init_ion();
	}
	
	private static final void init_ion() {
		repository = new UsersDB();
	}
	
	public static UsersDB getRepositoryUsers() {
		return repository;
	}
}