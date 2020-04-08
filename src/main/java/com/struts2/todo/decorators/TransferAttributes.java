package com.struts2.todo.decorators;

import java.util.Map;
import java.util.logging.Logger;

import com.struts2.DB.TransfersDB;
import com.struts2.beans.Transfer;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserTransfer;
import com.struts2.todo.ClassValidateUserIn;

public class TransferAttributes extends TransferDecorator implements CustomServletActionContext{
	private static final Map<String, Transfer> _transferMap = TransfersDB.returnMapTransfer();
	private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());

	public TransferAttributes(MethodsToDoUserTransfer methodsToDoUserTransfer) {
		super(methodsToDoUserTransfer);
	}
	
	@Override
	public void methodToDoTransfer() {
		LOGGER.info("--- LOGGER: method");
		this.MaptoAttribute();
		super.methodToDoTransfer();
	}
	
	private void MaptoAttribute() {
		LOGGER.info("--- LOGGER: method");
		my_request.setAttribute("userTransferContent", true);
		my_request.setAttribute("_transferMap", _transferMap);
	}
}
