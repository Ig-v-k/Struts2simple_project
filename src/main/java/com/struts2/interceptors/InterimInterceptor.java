//package com.struts2.interceptors;
//
//import java.util.logging.Logger;
//
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.Interceptor;
//
//public class InterimInterceptor implements Interceptor{
//	private static final long serialVersionUID = 1L;
//    private static final Logger LOGGER = Logger.getLogger(InterimInterceptor.class.getName());
//	
//	@Override
//	public void init() {
//		LOGGER.info("---LOGGER: class - InterimInterceptor; method - init()");
//	}
//	
//	@Override
//	public void destroy() {
//		LOGGER.info("---LOGGER: class - InterimInterceptor; method - destroy()");
//	}
//	
//	public String intercept(ActionInvocation actionInvocation) throws Exception {
//		LOGGER.info("---LOGGER: class - InterimInterceptor; method - intercept()");
//		return actionInvocation.invoke();
//	}
//}
