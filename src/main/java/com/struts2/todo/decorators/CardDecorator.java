package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUserCard;

public class CardDecorator implements MethodsToDoUserCard{
	
	private MethodsToDoUserCard methodsToDoUserCard;
	
	public CardDecorator(MethodsToDoUserCard methodsToDoUserCard) {
		this.methodsToDoUserCard = methodsToDoUserCard;
	}
	
	@Override
	public void TextAction() {
		this.methodsToDoUserCard.TextAction();
	}
}
