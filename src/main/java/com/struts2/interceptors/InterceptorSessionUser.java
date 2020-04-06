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
		LOGGER.info("--- LOGGER: logined_registeredUSER -> " + invocation.getInvocationContext().getSession().get("logined_registeredUSER"));
		if(invocation.getInvocationContext().getSession().get("logined_registeredUSER") != null)
			return invocation.invoke();
		return ActionsTexts.NONE;
	}
	
	@Override
	public void destroy() {
		LOGGER.info("--- LOGGER: destroy()");
	}
}
