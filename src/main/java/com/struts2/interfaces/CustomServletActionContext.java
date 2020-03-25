package com.struts2.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public interface CustomServletActionContext {
	HttpServletRequest my_request = ServletActionContext.getRequest();
	HttpSession my_session = ServletActionContext.getRequest().getSession();
}
