package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

public class HelloAction  extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    @Override
    public String execute() {
    	
        return ActionsTexts.SUCCESS;
    }
}
