package com.struts2.interceptors;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.struts2.interfaces.ActionsTexts;

public class InterceptorSessionUser extends AbstractInterceptor{
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(CheckLogInUserInterceptor.class.getName());
	
	@Override
	public void init() {
		LOGGER.info("--- LOGGER: init()");
	}
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		LOGGER.info("--- LOGGER: interceptor()");
		
		if(((String)invocation.getInvocationContext().getSession().get("loginedUSER")) != null || 
				((String)invocation.getInvocationContext().getSession().get("loginedUSER")).length() != 0 || 
				((String)invocation.getInvocationContext().getSession().get("loginedUSER")).isEmpty())
			return ActionsTexts.NONE;
		
		return invocation.invoke();
	}
	
	@Override
	public void destroy() {
		LOGGER.info("--- LOGGER: destroy()");
	}
}
