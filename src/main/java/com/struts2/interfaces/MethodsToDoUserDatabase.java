package com.struts2.interfaces;

import java.util.Map;

import com.struts2.beans.Users;

public interface MethodsToDoUserDatabase {
	Map<String, Users> returnMapUsers(String userRole);
}
