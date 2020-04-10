package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserTransfer;
import com.struts2.todo.decorators.TransferDecorator;

public class TransferFormContent extends TransferDecorator implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(TransferFormContent.class.getName());
	
	public TransferFormContent(MethodsToDoUserTransfer methodsToDoUserTransfer) {
		super(methodsToDoUserTransfer);
	}
	
	@Override
	public void methodToDoTransfer() {
		try {
			if(my_request.getParameter("actionTransfer") != null)
				if(my_request.getParameter("actionTransfer").equals("add"))
					my_request.setAttribute("addTransferForm", true);
		}
		finally {
			super.methodToDoTransfer();
		}
	}
}
