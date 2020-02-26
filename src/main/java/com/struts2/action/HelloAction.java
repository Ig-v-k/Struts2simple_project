package com.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
 
import com.opensymphony.xwork2.ActionSupport;

@Namespace(value="/")
@Action(value = "/hello",
	results = {
	        @Result(name = "success", location = "/WEB-INF/helloPageMain.jsp")
	}
)
public class HelloAction  extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    @Override
    public String execute() {
        return SUCCESS;
    }
}
