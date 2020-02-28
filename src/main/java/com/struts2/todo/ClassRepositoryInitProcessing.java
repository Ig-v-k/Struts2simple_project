package com.struts2.todo;

import com.struts2.DB.UsersDB;

final class ClassRepositoryInitProcessing {
	private static UsersDB repository;
	
	static {
		init_ion();
	}
	
	private static final void init_ion() {
		repository = new UsersDB();
	}
	
	public static UsersDB getRepository() {
		return repository;
	}
}