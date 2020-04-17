package com.struts2_iw.interfaces.impl;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserTransfer;

public class ImplMethodsTransfer implements MethodsToDoUserTransfer, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsTransfer.class.getName());
	
	@Override
	public void methodToDoTransfer() {
		LOGGER.info("--- LOGGER: method");
		my_request.setAttribute("userTransferContent", true);
		my_request.setAttribute("transferContent", true);
	}
}
