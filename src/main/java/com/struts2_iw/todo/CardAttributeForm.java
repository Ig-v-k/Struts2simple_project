package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserCard;
import com.struts2_iw.todo.decorators.CardDecorator;

public class CardAttributeForm extends CardDecorator implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(CardAttributeForm.class.getName());
	
	public CardAttributeForm(MethodsToDoUserCard methodsToDoUserCard) {
		super(methodsToDoUserCard);
	}
	
	@Override
	public void methodToDoCard(String userName) {
		try {
			if(my_request.getAttribute("actionCardContent") != null) {
				if(my_request.getAttribute("actionCardContent").equals("content")) {
					my_request.setAttribute("addFormCardContent", true);
					my_request.setAttribute("addFormCard", true);
				}
				if(my_request.getAttribute("actionCardContent").equals("edit"))
					my_request.setAttribute("editFormCard", true);
				if(my_request.getAttribute("actionCardContent").equals("cancel"))
					my_request.setAttribute("addFormCardContent", false);
			}
		} 
		finally {
			super.methodToDoCard(userName);
		}
	} // method
} // class
