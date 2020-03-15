package com.struts2.action;

import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

public class FirstBootAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Date currentDate;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private Map<String, Object> sessionDateTime;
	
	
	/*
	 * main
	 */
    public String boot() {
		LOGGER.info("---LOGGER: method - boot()");
    	setCurrentDate(new Date());
    	LOGGER.info("DAte = " + this.currentDate);
    	sessionDateTime.put("dateTime", this.currentDate);
		return ActionsTexts.SUCCESS;
    }
    
    
    @Override
	public void setSession(Map<String, Object> session) {
		   sessionDateTime = session ;
	}
    public void setCurrentDate(Date date) {
	      this.currentDate = date;
    }
}
