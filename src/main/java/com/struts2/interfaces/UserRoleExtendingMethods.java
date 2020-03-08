package com.struts2.interfaces;

public interface UserRoleExtendingMethods<T> {
	T getAll();
	void rename(String username, String password, String userRole);
}
