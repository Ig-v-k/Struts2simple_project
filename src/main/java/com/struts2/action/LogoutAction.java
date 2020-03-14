package com.struts2.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ImplMethodsLogout;
import com.struts2.todo.decorators.LogoutDecorator;

//@Namespace(value="/")
//@Action(value="logout", results = @Result(name = "logout", location = "/WEB-INF/logout.jsp"))
public class LogoutAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	
	public String userLogout() {
		new LogoutDecorator(
				new ImplMethodsLogout()).logoutUser(ServletActionContext.getRequest());
		addActionMessage("You are successfully logout!");
		return ActionsTexts.SUCCESS;
	}
}
