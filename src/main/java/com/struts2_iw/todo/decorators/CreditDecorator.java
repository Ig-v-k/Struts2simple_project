package com.struts2_iw.todo.decorators;

import com.struts2_iw.interfaces.MethodsToDoUserCredit;

public class CreditDecorator implements MethodsToDoUserCredit{
	private MethodsToDoUserCredit methodsToDoUserCredit;
	
	public CreditDecorator(MethodsToDoUserCredit methodsToDoUserCredit) {
		this.methodsToDoUserCredit = methodsToDoUserCredit;
	}
	
	@Override
	public void methodToDoCredit() {
		this.methodsToDoUserCredit.methodToDoCredit();	
	}
}
