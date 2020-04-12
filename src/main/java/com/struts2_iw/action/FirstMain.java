package com.struts2_iw.action;

import java.util.logging.Logger;

//import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;

public class FirstMain extends ActionSupport {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(FirstMain.class.getName());
    private static int i = 0;
    
    
    
    public String boot() {
		LOGGER.info("---LOGGER: method - boot() | count ---> " + ++i);
		return CustomActionsTexts.SUCCESS;
    }
}
