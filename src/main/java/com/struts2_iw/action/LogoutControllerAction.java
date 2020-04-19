package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.impl.ImplMethodsLogout;
import com.struts2_iw.todo.LogoutLoginedUser;
import com.struts2_iw.todo.decorators.LogoutDecorator;

//@Namespace(value="/")
//@Action(value="logout", results = @Result(name = "logout", location = "/WEB-INF/logout.jsp"))
public class LogoutControllerAction extends ActionSupport implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ProfileGetAction.class.getName());
	private static final long serialVersionUID = 1L;
	
	public String USER_logout() {
		LOGGER.info("--- LOGGER: method() ");
		LOGGER.info("--- LOGGER: logined_registeredUSER ---> " + my_session.getAttribute("logined_registeredUSER"));
		if(my_session.getAttribute("logined_registeredUSER") != null) {
			new LogoutLoginedUser(
					new LogoutDecorator(
							new ImplMethodsLogout())).logoutUser();
			addActionMessage("You are successfully logout!");
			return CustomActionsTexts.SUCCESS;
		}
		return CustomActionsTexts.NONE;
	}
}
