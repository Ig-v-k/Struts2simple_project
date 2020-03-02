package com.struts2.interceptors;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.struts2.DB.UsersDB;
import com.struts2.beans.Users;
import com.struts2.interfaces.UserAware;

public class CheckLogInUserInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(CheckLogInUserInterceptor.class.getName());
    UsersDB usersRepository = new UsersDB();
	
	public String intercept(ActionInvocation actionInvocation) throws Exception {
        HttpServletRequest request = (HttpServletRequest) actionInvocation.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
        String url = request.getRequestURI();
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        Users user = (Users) session.get("USER");
        
        if (request.getQueryString() != null) {
            url = url + "?" + request.getQueryString();
        }

        LOGGER.info("********* Request START *********");
        LOGGER.info("HttpRequestInterceptor URL -> " + url);
        LOGGER.info("****");
        
		Action action = (Action) actionInvocation.getAction();
		if(action instanceof UserAware) {
			((UserAware) action).setUser(user);
		}
		return actionInvocation.invoke();
						
	} // m:intercept()
		
} // c:CheckLogInUserInterceptor
