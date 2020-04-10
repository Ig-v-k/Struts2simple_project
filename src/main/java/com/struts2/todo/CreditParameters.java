package com.struts2.todo;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCredit;
import com.struts2.todo.decorators.CreditDecorator;

public class CreditParameters extends CreditDecorator implements CustomServletActionContext{
	
	public CreditParameters(MethodsToDoUserCredit methodsToDoUserCredit) {
		super(methodsToDoUserCredit);
	}
	
	@Override
	public void methodToDoCredit() {
		try {
			if(my_request.getParameter("actionCredit") != null)
				if(my_request.getAttribute("actionCredit").equals("add"))
					my_request.setAttribute("addCreditForm", true);
		}
		finally {
			super.methodToDoCredit();
		}
	}
}
