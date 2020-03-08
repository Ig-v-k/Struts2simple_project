package com.struts2.interfaces;

import java.util.List;
import java.util.Map;

import com.struts2.beans.Users;

public interface ValidateCheckBySearchUser {
	public boolean checkValidateSearchUser(Map<String, List<Users>> map, String username, String password);
}