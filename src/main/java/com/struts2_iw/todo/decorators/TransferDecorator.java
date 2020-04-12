package com.struts2_iw.todo.decorators;

import com.struts2_iw.interfaces.MethodsToDoUserTransfer;

public class TransferDecorator implements MethodsToDoUserTransfer{
	private MethodsToDoUserTransfer methodsToDoUserTransfer;
	
	public TransferDecorator(MethodsToDoUserTransfer methodsToDoUserTransfer) {
		this.methodsToDoUserTransfer = methodsToDoUserTransfer;
	}
	
	@Override
	public void methodToDoTransfer() {
		this.methodsToDoUserTransfer.methodToDoTransfer();	
	}
}
