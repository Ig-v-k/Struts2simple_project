package com.struts2.todo.decorators;

import java.util.logging.Logger;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserTransfer;
import com.struts2.todo.ClassValidateUserIn;

public class TransferFormContent extends TransferDecorator implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
	public TransferFormContent(MethodsToDoUserTransfer methodsToDoUserTransfer) {
		super(methodsToDoUserTransfer);
	}
	
	@Override
	public void methodToDoTransfer() {
		if(my_request.getParameter("actionTransfer") != null)
			this.FormToAttribute();
		super.methodToDoTransfer();
	}
	
	private void FormToAttribute() {
		if(my_request.getAttribute("actionTransfer").equals("add"))
			my_request.setAttribute("addTransferForm", true);
	}
}
