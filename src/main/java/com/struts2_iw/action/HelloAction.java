package com.struts2_iw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;

public class HelloAction  extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    public String boot() {
        return CustomActionsTexts.SUCCESS;
    }
}
