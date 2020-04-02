package com.struts2.interfaces;

import java.util.Map;

import com.struts2.beans.User;

public interface MethodsToDoUserDatabase {
	Map<String, User> returnMapUsers(String userRole);
}
