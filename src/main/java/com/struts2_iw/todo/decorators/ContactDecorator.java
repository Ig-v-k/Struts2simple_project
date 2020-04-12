package com.struts2_iw.todo.decorators;

import com.struts2_iw.interfaces.MethodsToDoUsersContact;

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
