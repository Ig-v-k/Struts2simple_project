package com.struts2_iw.todo;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUsersContact;

public class ImplMethodsContact implements MethodsToDoUsersContact, CustomServletActionContext{
	
	@Override
	public void methodToDoContact() {
		my_request.setAttribute("contactContent", true);
	}
}
