package com.struts2.todo;

import com.struts2.dao.UsersRepository;

final class ClassRepositoryInitProcessing {
	private static UsersRepository repository;
	
	static {
		init_ion();
	}
	
	private static final void init_ion() {
		repository = new UsersRepository();
	}
	
	public static UsersRepository getRepository() {
		return repository;
	}
}