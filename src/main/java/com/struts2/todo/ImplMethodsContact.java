package com.struts2.todo;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUsersContact;

public class ImplMethodsContact implements MethodsToDoUsersContact, CustomServletActionContext{
	
	@Override
	public void methodToDoContact() {
		my_request.setAttribute("contactContent", true);
	}
}
