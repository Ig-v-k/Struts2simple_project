package com.struts2_iw.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.util.ValueStack;

public interface CustomServletActionContext {
	PageContext my_context = ServletActionContext.getPageContext();
	HttpServletRequest my_request = ServletActionContext.getRequest();
	HttpSession my_session = ServletActionContext.getRequest().getSession();
	ValueStack my_values = ServletActionContext.getValueStack(my_request);
}
