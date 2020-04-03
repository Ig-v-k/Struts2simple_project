package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUsersContact;

public class ContactDecorator implements MethodsToDoUsersContact{
	private MethodsToDoUsersContact methodsToDoUsersContact;

	public ContactDecorator(MethodsToDoUsersContact methodsToDoUsersContact) {
		this.methodsToDoUsersContact = methodsToDoUsersContact;
	}
	
	@Override
	public void methodToDoContact() {
		this.methodsToDoUsersContact.methodToDoContact();
	}
}
