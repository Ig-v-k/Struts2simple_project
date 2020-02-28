package com.struts2.interceptors;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.struts2.beans.Users;
import com.struts2.dao.UsersRepository;
import com.struts2.interfaces.UserAware;

public class CheckLogInUserInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
//	protected String loggerName;
    private static final Logger LOGGER = Logger.getLogger(CheckLogInUserInterceptor.class.getName());
    UsersRepository usersRepository = new UsersRepository();
	
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
        
		if(user == null) {
			LOGGER.info("---LOGGER: if()");
			return ActionSupport.INPUT;
		}
		else {
			LOGGER.info("---LOGGER: if()-else");
			Action action = (Action) actionInvocation.getAction();
			if(action instanceof UserAware) {
				((UserAware) action).setUser(user);
			}
			return actionInvocation.invoke();
		}
		
//		return actionInvocation.invoke();
	}
	
//    public void setLoggerName(String loggerName) {
//        this.loggerName = loggerName;
//    }
//
//    private Logger getLogger() {
//        return Logger.getLogger(this.loggerName);
//    }
}
