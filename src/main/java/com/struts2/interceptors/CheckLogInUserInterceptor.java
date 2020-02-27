package com.struts2.interceptors;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.struts2.dao.UsersRepository;

public class CheckLogInUserInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
//	protected String loggerName;
    private static final Logger LOGGER = Logger.getLogger(CheckLogInUserInterceptor.class.getName());
    UsersRepository usersRepository = new UsersRepository();
	
	public String intercept(ActionInvocation actionInvocation) throws Exception {
        HttpServletRequest request = (HttpServletRequest) actionInvocation.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
        String url = request.getRequestURI();
        if (request.getQueryString() != null) {
            url = url + "?" + request.getQueryString();
        }

        LOGGER.info("********* Request START *********");
        LOGGER.info("HttpRequestInterceptor URL -> " + url);
        LOGGER.info("****");

		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		if(session.get("user") == null)
			return ActionSupport.ERROR;
		
        LOGGER.info("****");
        LOGGER.info("********* Request END  *********");
		
		return actionInvocation.invoke();
	}
	
//    public void setLoggerName(String loggerName) {
//        this.loggerName = loggerName;
//    }
//
//    private Logger getLogger() {
//        return Logger.getLogger(this.loggerName);
//    }
}
