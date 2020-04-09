package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;
import com.struts2.todo.decorators.CardDecorator;

public class CardAttributeForm extends CardDecorator implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(CardAttributeForm.class.getName());
	
	public CardAttributeForm(MethodsToDoUserCard methodsToDoUserCard) {
		super(methodsToDoUserCard);
	}
	
	@Override
	public void methodToDoCard(String userName) {
		try {
			if(my_request.getParameter("actionCardContent") != null) {
				if(my_request.getParameter("actionCardContent").equals("content"))
					my_request.setAttribute("addFormCardContent", true);
				if(my_request.getParameter("actionCardContent").equals("edit"))
					my_request.setAttribute("editFormCard", true);
			}
		} 
		finally {
			super.methodToDoCard(userName);
		}
	}
}
