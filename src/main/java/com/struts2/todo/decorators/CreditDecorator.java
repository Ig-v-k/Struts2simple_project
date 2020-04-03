package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUserCredit;

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
