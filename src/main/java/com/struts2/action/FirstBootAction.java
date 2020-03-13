package com.struts2.action;

import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

//@Namespace(value="/")
//@Action(value = "/",
//	results = {
//	        @Result(name = "success", location = "hello", type = "redirect")
//	})
public class FirstBootAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Date currentDate;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private Map<String, Object> userSession;
	
    public String boot() {
		LOGGER.info("---LOGGER: method - regist()");
    	setCurrentDate(new Date());
    	LOGGER.info("DAte = " + this.getCurrentDate());
    	userSession.put("dateTime", this.getCurrentDate());
		return ActionsTexts.SUCCESS;
    }
    
    @Override
	public void setSession(Map<String, Object> session) {
		   userSession = session ;
	}
    
    public void setCurrentDate(Date date) {
	      this.currentDate = date;
    }
    
	public Date getCurrentDate() {
	      return currentDate;
	}
}
