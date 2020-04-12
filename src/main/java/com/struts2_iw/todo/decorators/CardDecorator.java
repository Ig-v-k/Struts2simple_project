package com.struts2_iw.todo.decorators;

import com.struts2_iw.interfaces.MethodsToDoUserCard;

public class CardDecorator implements MethodsToDoUserCard{
	private MethodsToDoUserCard methodsToDoUserCard;
	
	public CardDecorator(MethodsToDoUserCard methodsToDoUserCard) {
		this.methodsToDoUserCard = methodsToDoUserCard;
	}
	
	@Override
	public void methodToDoCard(final String userName) {
		this.methodsToDoUserCard.methodToDoCard(userName);
	}
}
