package com.struts2.todo;

import java.util.Map;

import com.struts2.DB.CreditsDB;
import com.struts2.beans.Credit;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCredit;
import com.struts2.todo.decorators.CreditDecorator;

public class CreditAttributes extends CreditDecorator implements CustomServletActionContext{
	private static final Map<String, Credit> _creditsMap = CreditsDB.returnMapCredits();
	
	public CreditAttributes(MethodsToDoUserCredit methodsToDoUserCredit) {
		super(methodsToDoUserCredit);
	}
	
	@Override
	public void methodToDoCredit() {
		this.MaptoAttribute();
		super.methodToDoCredit();
	}
	
	private void MaptoAttribute() {
		my_request.setAttribute("_creditMap", _creditsMap);
	}
}
