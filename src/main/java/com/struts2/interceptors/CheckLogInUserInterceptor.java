 package com.struts2.interceptors;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CheckLogInUserInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(CheckLogInUserInterceptor.class.getName());
	
    @Override
	public String intercept(ActionInvocation invocation) throws Exception {
        HttpServletRequest request = (HttpServletRequest) invocation.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
        String url = request.getRequestURI();
//		Map<String, Object> session = invocation.getInvocationContext().getSession();
//        String username = (String) session.get("USERlogin");
        
        
        
        if (request.getQueryString() != null) {
            url = url + "?" + request.getQueryString();
        }

        LOGGER.info("\t********* Request START *********\n"
        		+ "HttpRequestInterceptor URL -> " + url);
        LOGGER.info("\t*********************************");
        
//		Action action = (Action) invocation.getAction();
//		if(action instanceof UserAware) {
//			((UserAware) action).setUser(username);
//		}
		return invocation.invoke();				
	} // m:intercept()
} // c:CheckLogInUserInterceptor
