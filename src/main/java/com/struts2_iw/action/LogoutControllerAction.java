package com.struts2_iw.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.impl.ImplMethodsLogout;
import com.struts2_iw.todo.decorators.LogoutDecorator;

//@Namespace(value="/")
//@Action(value="logout", results = @Result(name = "logout", location = "/WEB-INF/logout.jsp"))
public class LogoutControllerAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	
	public String USER_logout() {
		if(ServletActionContext.getRequest().getSession().getAttribute("logined_registeredUSER") != null) {
			new LogoutDecorator(
					new ImplMethodsLogout()).logoutUser(ServletActionContext.getRequest());
			addActionMessage("You are successfully logout!");
			return CustomActionsTexts.SUCCESS;
		}
		return CustomActionsTexts.NONE;
	}
}
